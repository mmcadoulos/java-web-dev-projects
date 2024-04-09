package org.launchcode;

import java.time.LocalDate;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;
//    private Boolean isNew;

    public MenuItem(String name, double price, String description, String category, /*Boolean isNew*/ LocalDate dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
//        this.isNew = isNew;
        this.dateAdded = dateAdded;
        if (Objects.equals(category, "Appetizer") || Objects.equals(category, "Main Course") || Objects.equals(category, "Dessert")) {
            this.category = category;
        } else {
            this.category = null;
        }
    }

    public Boolean isNew() {
        // conditional based on date added...need to look up how to use the class
        if (dateAdded.isAfter(LocalDate.of(2024, 4, 1))) {
            return true;
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

//    public Boolean getNew() {
//        return isNew;
//    }

//    public void setNew(Boolean aNew) {
//        isNew = aNew;
//    }
}
