package model;

import java.time.LocalDate;

/**
 * Common information shared by all employee types.
 */
public abstract class Employee {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate hireDate;
    private Department department;

    public Employee(int id, String name, Gender gender, LocalDate hireDate, Department department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hireDate = hireDate;
        this.department = department;
    }

    public abstract double calculateSalary();

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Gender: %s | Department: %s | Salary: %.2f",
                id, name, gender,
                department == null ? "Unassigned" : department.getName(),
                calculateSalary());
    }
}
