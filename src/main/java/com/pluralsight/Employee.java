package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // for a punch out
    private  int punchInTime;

    public Employee(String department, int employeeId, double hoursWorked, String name, double payRate) {
        this.department = department;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.payRate = payRate;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();
        double overTimePay = this.payRate * this.getOvertimeHours() * 1.5;

        return regularPay + overTimePay;
    }
    // Manual punch in
    public void punchIn(int time) {
        this.punchInTime = time;
    }
    // Manual punch out
    public void punchOut(int time) {
        double currentHoursWorked = time - punchInTime;
        hoursWorked += currentHoursWorked;
    }
    //Bonus method
    public void punchTimeCard(int start, int endTime) {
        punchIn(start);
        punchOut(endTime);
    }
    // Punch in using current time
    public void punchIn() {
        int currentHour = LocalDateTime.now().getHour();
        punchIn(currentHour);
    }

    // Punch out using current time
    public void punchOut() {
        int currentHour = LocalDateTime.now().getHour();
        punchOut(currentHour);
    }
}

