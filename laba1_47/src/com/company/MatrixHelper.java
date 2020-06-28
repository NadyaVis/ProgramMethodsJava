package com.company;

public class MatrixHelper {

    public static void fiilMaatrix(int [][] A, int m){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = m * i + j;
            }
        }
    }

    public static void rotateMatrixTo90Degree(int [][] A, int m){
        for (int k = 0; k < m / 2; k++) {
            for (int j = k; j < m - 1 - k; j++) {
                int tmp = A[k][j];
                A[k][j] = A[j][m - 1 - k];
                A[j][m - 1 - k] = A[m - 1 - k][m - 1 - j];
                A[m - 1 - k][m - 1 - j] = A[m - 1 - j][k];
                A[m - 1 - j][k] = tmp;
            }
        }
    }

    public static void printMatrix(int [][] A, int m){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
    }

}
