package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter a radius: ");

        try {
            Double radius = in.nextDouble();
        } catch (Exception error) {
            println("Please Enter a Number");
        }
//        println("radius: " + radius);
//        double doubleRadius = 0.0;
//        try {
//            doubleRadius = Double.parseDouble(radius);
//        } catch (ArithmeticException e){
//            println("Please Enter a Number");
//        }
        if (radius != 0.0) {
            Double area = Circle.getArea(radius);
            println("The area of a circle of radius " + radius + " is: " + area);
        }
    }

    public static void println(String line) {
        System.out.println(line);
    }

    public static void print(String line) {
        System.out.print(line);
    }
}
