package model;

import java.time.LocalDate;

/** Employee who receives a fixed monthly salary. */
public class MonthlyEmployee extends Employee {
    private double monthlySalary;

    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           Department department, double monthlySalary) {
        super(id, name, gender, hireDate, department);
        setMonthlySalary(monthlySalary);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) throw new IllegalArgumentException("Monthly salary cannot be negative.");
        this.monthlySalary = monthlySalary;
    }
}
