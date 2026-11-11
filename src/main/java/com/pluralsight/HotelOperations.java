package com.pluralsight;

import javax.print.DocFlavor;
import java.time.LocalTime;

public class HotelOperations {
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // ROOM TEST
        Room room1 = new Room(true, 3, false, 150.00);


        System.out.println(BRIGHT_WHITE + """
                        \n██████████████████████████████████████████████
                        ──────────────────────────────────────────────
                                🏰 HOTEL TRANSYLVANIA 🏰
                        ──────────────────────────────────────────────
                        ██████████████████████████████████████████████
                        """ + RESET
                );
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        // RESERVATION TEST
        Reservations reservation1 =
                new Reservations( "king", 3, true);

        System.out.println(BRIGHT_BLUE + """
                \n██████████████████████████████████████████████
                                 RESERVATION
                ██████████████████████████████████████████████""" + RESET);
        System.out.println();

        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("Room Type: " + reservation1.getRoomType());
        System.out.println("Nights: " + reservation1.getNumberOfNights());
        System.out.println("Weekend: " + reservation1.isWeekend());
        System.out.println("Price Per Night: $" + reservation1.getPrice());
        System.out.println("Reservation Total: $" + reservation1.getReservationTotal());
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

        System.out.println();

        // EMPLOYEE TEST
        Employee employee1 =
                new Employee("Front Desk", 105, 20.00, "Cherish", 34);

        System.out.println(BRIGHT_CYAN + """ 
                   ██████████████████████████████████████████████
                   
                   """ + BRIGHT_YELLOW + """
                               ➤  E  MP LOY  EE ➤
                   """ + BRIGHT_CYAN + """
                   
                   ██████████████████████████████████████████████
                                     """ + RESET);

        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.println("Total Pay: $" + employee1.getTotalPay());
    }
}



