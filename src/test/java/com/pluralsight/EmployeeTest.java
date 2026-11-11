package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    //Test 1: Regular hours should not exceed 40

    @Test
    public void testGetRegularHours() {
        Employee myEmployee = new Employee("Software",104, 40, "Cynthia", 25);

        assertEquals( 40,myEmployee.getRegularHours());

    }
    //Test 2: Overtime hours should calculate correctly
    @Test
    public void testGetOverTimeHours() {
        Employee myEmployee = new Employee("IT", 103,22,"Solomon", 26);

        assertEquals(5,myEmployee.getOvertimeHours());

    }
    //Test 3: Total pay should include overtime pay
    @Test
    public void testGetTotalPay() {
        Employee myEmployee = new Employee("IT", 107,22,"Trisha", 30);

        assertEquals(950.0, myEmployee.getTotalPay(),0.001);
    }


}