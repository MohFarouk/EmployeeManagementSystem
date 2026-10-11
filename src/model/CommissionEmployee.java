package model;

import java.time.LocalDate;

/** Employee paid a base salary plus a percentage of sales. */
public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double grossSales;
    private double commissionRate; // e.g. 0.08 means 8%

    public CommissionEmployee(int id, String name, Gender gender, LocalDate hireDate,
                              Department department, double baseSalary,
                              double grossSales, double commissionRate) {
        super(id, name, gender, hireDate, department);
        setBaseSalary(baseSalary);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + grossSales * commissionRate;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative.");
        this.baseSalary = baseSalary;
    }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) {
        if (grossSales < 0) throw new IllegalArgumentException("Gross sales cannot be negative.");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1)
            throw new IllegalArgumentException("Commission rate must be between 0 and 1.");
        this.commissionRate = commissionRate;
    }
}
