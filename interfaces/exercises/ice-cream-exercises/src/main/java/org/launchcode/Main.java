package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comp = new FlavorComparator();
//        System.out.println(flavors);
//        for (Flavor flavor:flavors){
//            System.out.println(flavor);
//        }
        flavors.sort(comp);
        System.out.println("Sorted flavors:\n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }
//        System.out.println(flavors);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
//        for (Cone cone : cones){
//            System.out.println(cone);
//        }
        cones.sort(new ConeComparator());
        System.out.println("Sorted cones:\n");
        for (Cone cone : cones) {
            System.out.println(cone);
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        //TODO: sort and print Toppings
        for (Topping topping : toppings) {
            System.out.println(topping);
        }
        toppings.sort(new ToppingComparator());
        System.out.println("Sorted toppings:\n");
        for (Topping topping : toppings) {
            System.out.println(topping);
        }
    }
}