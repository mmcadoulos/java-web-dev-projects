package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the radius of the circle: ");
//        Double radius = input.nextDouble();
////        double area = Math.PI * Math.pow(radius, 2);
////        VALIDATION
//        if (radius <= 0 || ){
//            System.out.println("Error. Please enter a positive number");
//            return;
//        }
//
//        double area = Circle.getArea(radius);
//        System.out.println("The area is " + area);
//        input.close();
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.print("Please enter the radius of the circle (must be a positive number): ");
            while (!input.hasNextDouble()){
                System.out.print("Error. Please enter a number: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area is " + area);
        input.close();
    }

}
