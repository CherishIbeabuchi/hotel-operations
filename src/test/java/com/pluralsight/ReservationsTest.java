package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationsTest {

    @Test
    public void getPrice_should_be_accurate_for_king_suite_no_weekend(){
        //arrange
        Reservations myReservation = new Reservations("king", 1, false);

        //act
        double price = myReservation.getPrice();

        //assert
        assertEquals(139, price);
    }

    @Test
    public void getPrice_should_be_accurate_for_king_suite_with_weekend(){
        //arrange
        Reservations myReservation = new Reservations("king", 1, true);

        //act
        double price = myReservation.getPrice();

        //assert
        assertEquals(152.9, price);
    }

    @Test
    public void getReservationTotal_should_be_accurate_for_king_suite_with_weekend_3_nights(){
        //arrange
        Reservations myReservation = new Reservations("king", 1, true);

        //act
        double total = Math.round(myReservation.getReservationTotal());

        //assert
        assertEquals(153.0, total);
    }

}

