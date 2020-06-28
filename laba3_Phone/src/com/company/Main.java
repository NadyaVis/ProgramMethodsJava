package com.company;

import com.company.rates.*;
import com.company.userExceptions.ContinueException;
import com.company.userExceptions.MenuException;
import com.company.userExceptions.ParamsException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n=4;

        Rate[] rates = new Rate[n];
        rates[0] = new LowRate();
        rates[1] = new MiddleRate();
        rates[2] = new HighMiddleRate();
        rates[3] = new HighMaxRate();


        Connector.serializeAll(rates);


        MyExecutor.runTwoThreads(n);


    }
    public static void showRatesByParams(Rate[] rates, int subscriptionFee, int smsPrice, int megaBaitsCount, int megaBaitPrice, int peoplesCount){
        for(int i = 0;i < rates.length;i++){
            if(
                    (rates[i].getSubscriptionFee() == subscriptionFee) &&
                    (rates[i].getSmsPrice() == smsPrice) &&
                    (rates[i].getMegaBaitsCount() == megaBaitsCount) &&
                    (rates[i].getMegaBaitPrice() == megaBaitPrice) &&
                    (rates[i].getPeoplesCount() == peoplesCount)
            ){
                System.out.println(rates[i]);
            }
        }
    }

    public static void sort(Rate[] rates){
        Arrays.sort(rates);
    }

    public static void showPeoplesCount(Rate[] rates){
        int sum = 0;
        for(int i = 0;i < rates.length;i++){
            sum += rates[i].getPeoplesCount();
        }
        System.out.println(sum);
    }

    public static int inputOptionAndCheck(){
        try {
            int res = inputOneInt();
            if(res==1 || res ==2 || res ==3 || res ==4){
                return res;
            }else {
                throw new MenuException();
            }
        }catch (MenuException menuException){
            System.out.println(menuException) ;
            return 1;
        }
    }

    public static int inputParamAndCheck(){
        try {
            int res = inputOneInt();
            if(res<0){
                throw new ParamsException();
            }
            return res;
        }catch (ParamsException paramsException){
            System.out.println(paramsException) ;
            return 0;
        }
    }

    public static int inputOneInt(){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        return s;
    }

    public static char inputContinueCharAndCheck(){
        try {
            char res = inputOneChar();
            if(res == 'y' || res == 'n'){
                return res;
            }else{
                throw new ContinueException();
            }

        }catch (ContinueException continueException){
            System.out.println(continueException) ;
            return 'n';
        }
    }

    public static char inputOneChar(){
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        char s = data.charAt(0);
        return s;
    }

    public static void showRates(Rate[] rates){
        for (int i = 0; i < rates.length; i++) {
            System.out.println(rates[i]);
        }
    }
}
