package org.launchcode;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        this.name = aName;
    }

    public HouseCat(String aName) {
        // super(13); /* would do the same as a no-arg constructor */
        this.name = aName;
    }

    public HouseCat(double aWeight) {
        super(aWeight);
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a org.launchcode.HouseCat";
    }

    public Boolean overrideTest(double weight1, double weight2) {return (weight1 != weight2);}
}