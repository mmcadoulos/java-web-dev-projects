package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Backstreet Boys", "CD", 500, 200);
        DVD dvd = new DVD("Backstreet Boys Live!", "DVD", 4000, 2500);
// TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();
        cd.storeData(400);
//        cd.storeData(300);
        cd.storeData(1);

        dvd.storeData(2500);
//        dvd.storeData(1500);
        dvd.storeData(1);
        cd.writeData(100, "One");
        System.out.println(cd.getContents());

        cd.discInfo();
        dvd.discInfo();

    }
}