package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Caelus");
        planets.add("Neptune");

//        Collections.sort(planets);
        System.out.println(planets);
        System.out.println(planets.size());
        System.out.println(planets.contains("Uranus"));
        System.out.println(planets.contains("Caelus"));
        System.out.println(planets.indexOf("Jupiter"));

        Collections.sort(planets);
        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
        System.out.println(Arrays.toString(planetsArray));
    }
}
