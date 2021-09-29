package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x= value.nextInt();
        System.out.print("Enter value of y: ");
        int y= value.nextInt();

        double dist=length(x,y);
        System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0) is "+dist);
    }
    static double length(int x,int y){
        return Math.sqrt(Math.pow((x-0),2)+Math.pow((y-0),2));
    }
}