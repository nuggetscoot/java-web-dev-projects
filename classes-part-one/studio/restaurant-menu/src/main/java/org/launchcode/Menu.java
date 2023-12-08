package org.launchcode;
import java.util.Date;
import java.util.ArrayList;
public class Menu {
    private Date lastUpdated;
    private ArrayList menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date(); // Initialize with the current date and time
    }
    public void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

};

