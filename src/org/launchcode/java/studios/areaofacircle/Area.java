package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter a radius: ");
        Double radius = null;
        while (radius == null || radius <= 0) {
            if (in.hasNextDouble() && in.nextDouble() > 0) {
                radius = in.nextDouble();
            } else {
                println("Please Enter a Number Greater than 0");
                print("Enter a radius: ");
                in.next();
            }
        }
        Double area = Circle.getArea(radius);
        println("The area of a circle of radius " + radius + " is: " + area);
    }

    public static void println(String line) {
        System.out.println(line);
    }

    public static void print(String line) {
        System.out.print(line);
    }
}
