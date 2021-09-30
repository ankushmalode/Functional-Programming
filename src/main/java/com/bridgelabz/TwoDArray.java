package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = value.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = value.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the vales of the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                arr[i][j] = value.nextInt();
        }
            System.out.println("The 2d array will be:");
            for (int m = 0; m < r; m++) {
                for (int n = 0; n < c; n++)
                    System.out.print(arr[m][n] + " ");
                System.out.println();
            }
    }
}