package com.bridgelabz;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter three value a, b, c ");
        double a = value.nextDouble();
        double b = value.nextDouble();
        double c = value.nextDouble();

        double quadratic[]=root(a,b,c);
        System.out.println("Root1:"+quadratic[0]);
        System.out.println("Root2:"+quadratic[1]);

    }

    static double[] root(double a, double b, double c){
        double delta = Math.sqrt((b * b) - (4 * a * c));
        double root1 = (-b + (delta)) / (2 * a);
        double root2 = (-b - (delta)) / (2 * a);
        double[] arr=new double[2];
        arr[0]=root1;
        arr[1]=root2;
        return arr;
    }
}