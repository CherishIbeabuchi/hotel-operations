package com.pluralsight;

public class Reservations {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservations(int numberOfNights, String roomType, boolean weekend) {
        this.numberOfNights = numberOfNights;
        this.roomType = roomType;
        this.weekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isWeekend() {
        return weekend;
    }
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice() {
        double pricePerNight;

        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else {
            pricePerNight = 124.00;
        }
        return pricePerNight;
    }
    public double getReservationTotal () {
        return  getPrice() * numberOfNights;
    }
}
