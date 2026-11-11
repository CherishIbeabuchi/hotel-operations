package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    // Testing if a clean and unoccupied room is available
    @Test
    public void testisAvailable() {

        //Arrange: Create a room that is clean and not occupied
        Room room = new Room(false, 3, false, 150.00);

        //Act: Check if the room is available
        boolean result = room.isAvailable();

        //Assert: The room should be available (true)
        assertTrue(result);

    }

    // Test 2 --- Check if cleaning a room changes its dirty status
    @Test
    public void testCleanRoom() {

        //Arrange
        Room room = new Room(false, 3, false, 150.00);

        //Act: Clean the room
        room.cleanRoom();

        assertFalse(room.isDirty());

    }
    @Test
    public void testCheckinAndCheckout() {

        //Arrange: Create a clean, unoccupied room
        Room room = new Room(false, 3, false, 150.00);

        //Act: Check in a guest
        room.checkIn();

        //Assert : The room should now be occupied and dirty

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

        //Act: Check out guest
        room.checkOut();

        //Assert: the room should now be unoccupied and clean
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

}