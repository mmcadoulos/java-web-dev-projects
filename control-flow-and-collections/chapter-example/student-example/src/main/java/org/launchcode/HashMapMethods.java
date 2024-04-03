package org.launchcode;

import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Caelus", 27);
        moons.put("Neptune", 14);


        System.out.println(moons.size());
        System.out.println(moons.keySet());
        System.out.println(moons.values());
        moons.put("Pluto", 5);
        System.out.println(moons.containsKey("Pluto"));
        System.out.println(moons.containsValue(283));
    }
}
