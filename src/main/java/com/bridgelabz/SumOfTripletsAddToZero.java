package com.bridgelabz;

import java.util.Scanner;

public class SumOfTripletsAddToZero {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number +ve or -ve: ");
        int num = value.nextInt();
        int[] arr = new int[num];
        int n= arr.length;
        TripletsToZero(arr,n);
    }
    static void TripletsToZero(int[] arr,int n){
        boolean found;
        for (int i=0; i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Sum of three Integer adds to ZERO is: "+arr[i]+" "+arr[j]+" "+arr[k]+"\n");
                        found=true;
                    }
                }
            }
        }
        if (found=false)
            System.out.println("Sum of three Integer adds to ZERO not found");
    }
}
