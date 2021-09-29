package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    static double Wind(double t, double v) {
        double w = 0;
        if (t > 50 && v < 120 && v > 3) {
            w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
        } else
            System.out.println("You have entered wrong values.");
        return w;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("You have to enter value Temperature>50 & 3<speed<120 in between.");
        System.out.print("Enter Temperature t(in Fahrenheit): ");
        double temp = value.nextDouble();
        System.out.print("Enter wind speed v: ");
        double speed = value.nextDouble();

        double c = Wind(temp, speed);
        System.out.println(c);
    }
}