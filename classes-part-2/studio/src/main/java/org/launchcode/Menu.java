package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void printMenu() {
        System.out.println("<" + items.get(0).getCategory() + "s>\n");
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("\nUpdated: " + this.getLastUpdated() + "\n");
    }

    public void addItems(MenuItem item) {
        items.add(item);
        this.setLastUpdated(LocalDate.now());
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.setLastUpdated(LocalDate.now());
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


