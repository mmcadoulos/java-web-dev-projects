package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private LocalDate dateUpdated;

    public Menu(){}

    public void addMenuItem(MenuItem item){
        menuList.add(item);
    }

    // print menu function?

    // list new items function?

    // list full menu item description function?

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
