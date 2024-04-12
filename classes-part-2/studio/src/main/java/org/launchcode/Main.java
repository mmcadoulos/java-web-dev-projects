package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        LocalDate date = LocalDate.now();
        ArrayList<MenuItem> mainCourse = new ArrayList<MenuItem>();
        ArrayList<MenuItem> apps = new ArrayList<MenuItem>();
        ArrayList<MenuItem> desserts = new ArrayList<MenuItem>();
        // create menu items
        MenuItem spaghetti = new MenuItem(5.00, "Spaghetti with Meatballs", "Main Course", false);
        MenuItem cheeseburger = new MenuItem(3.50, "Classic Cheeseburger", "Main Course", false);
        MenuItem cheeseSticks = new MenuItem(1.50, "Mozzarella Cheese Sticks", "Appetizer", false);
        MenuItem chocolateCake = new MenuItem(2.00, "Chocolate Cake", "Dessert", false);

        // add new menu items to menuItems, create menu with menuItems arraylist arg
        mainCourse.add(cheeseburger);
        mainCourse.add(spaghetti);
        apps.add(cheeseSticks);
        desserts.add(chocolateCake);

        Menu myMain = new Menu(LocalDate.now(), mainCourse);
        Menu myDesserts = new Menu(LocalDate.now(), desserts);
        Menu myApps = new Menu(LocalDate.now(), apps);

        // create and add new items use menu.addItems() or menu.addItem()
        myApps.addItems(new MenuItem(3.00, "Hot Wings", "Appetizer", true));
        myMain.addItems(new MenuItem(4.00, "Gyro", "Main Course", true));
        myDesserts.addItems(new MenuItem(1.50, "Ice Cream", "Dessert", true));
        // print menu
        myApps.printMenu();
        myMain.printMenu();
        myDesserts.printMenu();
    }
}
