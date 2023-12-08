package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    public Date date;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.date = new Date();
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
