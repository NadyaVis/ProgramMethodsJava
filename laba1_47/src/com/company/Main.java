package com.company;

public class Main {

    public static void main(String[] args) {
        int m = 7;
        int[][] A = new int[m][m];

        MatrixHelper.fiilMaatrix(A, m);


        System.out.println("Исходная матрица");
        MatrixHelper.printMatrix(A, m);


        System.out.println("Перевернутая на 90 градусов матрица");
        MatrixHelper.rotateMatrixTo90Degree(A, m);
        MatrixHelper.printMatrix(A, m);



        System.out.println("Перевернутая на 180 градусов матрица");
        MatrixHelper.rotateMatrixTo90Degree(A, m);
        MatrixHelper.printMatrix(A, m);

        System.out.println("Перевернутая на 270 градусов матрица");
        MatrixHelper.rotateMatrixTo90Degree(A, m);
        MatrixHelper.printMatrix(A, m);
    }
}
