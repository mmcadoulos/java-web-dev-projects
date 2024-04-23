package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private String discType;
    private int totalCapacity;
    private int storedCapacity;
    private ArrayList<String> contents = new ArrayList<>();

    public BaseDisc(String name, String discType, int totalCapacity, int storedCapacity) {
        this.name = name;
        this.discType = discType;
        this.totalCapacity = totalCapacity;
        this.storedCapacity = storedCapacity;

    }

    public void storeData(int dataSize) {
        int remainingCapacity = totalCapacity - storedCapacity;
        if (dataSize <= remainingCapacity) {
            storedCapacity += dataSize;
            System.out.println("Storage Succesful! " + storedCapacity + "MB stored on " + name + ".");
        } else {
            System.out.println("Data size " + dataSize + "MB is too big to store on " + name + "!");
        }
    }

    public void writeData(int dataSize, String aContent) {
        int remainingCapacity = totalCapacity - storedCapacity;
        if (dataSize <= remainingCapacity) {
            contents.add(aContent);
            System.out.println(discType +": data write success!");
        } else {
            System.out.println(discType + ": data write unsuccessful");
        }
    }

    public void discInfo(){
        System.out.println("Name: " + name + "\nDisc Type: "+ discType + "\nTotal Capacity: " + totalCapacity + "MB\nAmount Stored: "+ storedCapacity+ "MB\nContents:");
        for (String content : contents){
            System.out.println("- "+content);
        }
        System.out.println("\n");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getStoredCapacity() {
        return storedCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setStoredCapacity(int storedCapacity) {
        this.storedCapacity = storedCapacity;
    }
}
