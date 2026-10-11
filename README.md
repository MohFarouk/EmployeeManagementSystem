# Employee Management System

**Student Name:** Mohamed Mahmoud Farouk  
**Student ID:** 2302009

## Description

A Java employee management system demonstrating object-oriented programming concepts, including inheritance, polymorphism, encapsulation, an enum, and associations between departments and employees.

## Classes

- `Employee` — Abstract parent class containing shared employee details and the `calculateSalary()` method.
- `CommissionEmployee` — Employee with a base salary and commission on sales.
- `MonthlyEmployee` — Employee receiving a fixed monthly salary.
- `HourlyEmployee` — Employee paid by the hour, with overtime above 40 hours paid at 1.5 times the regular hourly rate.
- `Department` — Manages employees and calculates total payroll.
- `Gender` — Enum representing employee gender.
- `Main` — Demonstrates the system using sample data.
- `MainTest` — Runs executable tests using Java assertions.

## Requirements

- JDK 17 or later

## How to Run

Open a terminal in the project root directory and compile the source files:

```bash
javac -d out src/model/*.java src/Main.java src/test/MainTest.java
```

Run the demonstration:

```bash
java -cp out Main
```

Run the tests:

```bash
java -ea -cp out MainTest
```

## GitHub Repository

[Employee Management System](https://github.com/MohFarouk/EmployeeManagementSystem)

## Note

The implementation was prepared based on the class names and project structure provided in the assignment instructions. The original UML diagram should be checked to verify that all attributes, method signatures, access modifiers, and relationships match the required design.
