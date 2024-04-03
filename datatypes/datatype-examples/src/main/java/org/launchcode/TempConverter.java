package org.launchcode;

import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
//        double celsius;
        /*java.util.*/Scanner input; //the variable input references a Scanner object.

        input = new /*java.util.*/Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        double celsius = (fahrenheit - 32) * 5/9;
        String[] world = Message.getMessage("el").split(" ")/*[(Message.getMessage("sp").length() -1)]*/;
        String worldWord = world[(world.length -1)];
        System.out.println("The temperature in Celsius is: " + celsius + "°C in this " + worldWord);

//        input = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String banana = input.nextLine();
//        input.close();
//
//        if (banana.equalsIgnoreCase("banana")){
//            System.out.println("BANANA MAN!");
//        } else {
//            System.out.println("No banana man :(");
//        }

//        String[] strArray = new String[3];
//        String[] strArray2 = {"hello", "banana"};
//        System.out.println(strArray2[1]);
    }
}
