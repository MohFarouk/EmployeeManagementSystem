package model;

import java.time.LocalDate;

/** Employee paid by the hour. */
public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                          Department department, double hoursWorked, double hourlyRate) {
        super(id, name, gender, hireDate, department);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    @Override
    public double calculateSalary() {
        // Hours above 40 are paid at 1.5x the normal hourly rate.
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return regularHours * hourlyRate + overtimeHours * hourlyRate * 1.5;
    }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) throw new IllegalArgumentException("Hours worked cannot be negative.");
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Hourly rate cannot be negative.");
        this.hourlyRate = hourlyRate;
    }
}
