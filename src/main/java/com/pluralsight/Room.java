package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(boolean available, boolean dirty, int numberOfBeds, boolean occupied, double price) {
        this.available = available;
        this.dirty = dirty;
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.price = price;
    }

    public boolean isAvailable() {
        if (dirty == false && occupied == false) {
            return true;
        }
        return false;
    }
    public boolean isDirty() {
        return dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        return price;
    }
}
