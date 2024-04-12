package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean iN) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = iN;
    }

    @Override
    public String toString() {
        if (isNew) {
            return "$" + price + "\t" + "*NEW* " + description;
        }

        return "$" + price + "\t" + description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return this.category;
    }
}

