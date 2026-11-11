package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room( boolean dirty, int numberOfBeds,
                boolean occupied, double price) {
        this.dirty = dirty;
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.price = price;
    }

    public boolean isAvailable() {

        // if statements
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
    public void cleanRoom(){
        this.dirty = false;
    }

    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut(){
        this.occupied = false;
        this.cleanRoom();
    }
}

