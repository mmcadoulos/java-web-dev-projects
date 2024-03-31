package org.launchcode;
import java.util.Scanner;

public class NumericTypesMiles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How much gas was consumed (in gallons)?");
        Double gas = input.nextDouble();
        Double mpg = miles/gas;
        System.out.println("Your trip's fuel efficiency was: " + mpg + "mpg");
        input.close();
    }
}
