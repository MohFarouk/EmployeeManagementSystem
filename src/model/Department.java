package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A department groups employees. */
public class Department {
    private int id;
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) throw new IllegalArgumentException("Employee cannot be null.");
        if (!employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }

    public boolean removeEmployee(Employee employee) {
        if (employees.remove(employee)) {
            if (employee.getDepartment() == this) employee.setDepartment(null);
            return true;
        }
        return false;
    }

    public double getTotalMonthlyPayroll() {
        return employees.stream().mapToDouble(Employee::calculateSalary).sum();
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
