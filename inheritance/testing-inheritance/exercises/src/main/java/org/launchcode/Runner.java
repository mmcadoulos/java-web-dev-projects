package org.launchcode;

public class Runner {

    public static void main(String[] args) {
        HouseCat spunky = new HouseCat("Spunky", 4.4);
//        System.out.println(spunky.getFamily());
//        System.out.println("Spunky's noise: " + spunky.noise());


//        org.launchcode.Cat banana = new org.launchcode.Cat(1.010);
        Cat banana = new HouseCat("Banana",1.010);
//        System.out.println("Spunky is tired: " + spunky.isTired());
//        spunky.eat();
//        System.out.println("Spunky is tired: " + spunky.isTired());
//
//        System.out.println("Spunky is satisfied: " + spunky.isSatisfied());
//        System.out.println(spunky.purr());
//        spunky.sleep();
//        spunky.eat();
//        System.out.println("Spunky is satisfied: " + spunky.isSatisfied());


//        System.out.println("Banana's noise: " + banana.noise());
//        org.launchcode.HouseCat jimbo = new org.launchcode.HouseCat("Jimbo");
//        System.out.println(jimbo.getWeight());
//        org.launchcode.HouseCat kitkat = new org.launchcode.HouseCat(4.4);
//        System.out.println(kitkat.noise());
//        System.out.println(kitkat.getWeight());
//        org.launchcode.HouseCat.banana();
//
//        System.out.println(jimbo.overrideTest(jimbo.getWeight(), spunky.getWeight()));
//        System.out.println(banana.overrideTest(banana.getWeight(), jimbo.getWeight()));

        /*House*/Cat suki = new HouseCat("Suki", 8.4);
//        org.launchcode.Cat suki = new org.launchcode.Cat();
        System.out.println(((HouseCat) suki).isSatisfied());
    }
}
