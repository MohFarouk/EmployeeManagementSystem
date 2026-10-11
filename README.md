# Employee Management System

**Student name:** Mohamed Farouk  
**Student ID:** `ADD_YOUR_STUDENT_ID`

## Description
A small Java employee-management project demonstrating inheritance, polymorphism, encapsulation, an enum, and a department-to-employee association.

### Included classes
- `Employee` — abstract parent class with shared employee details and `calculateSalary()`.
- `CommissionEmployee` — base salary plus commission on sales.
- `MonthlyEmployee` — fixed monthly salary.
- `HourlyEmployee` — hourly pay, with overtime above 40 hours paid at 1.5x.
- `Department` — stores employees and calculates the total payroll.
- `Gender` — enum used by employee objects.
- `Main` — runs a demonstration with sample data.
- `MainTest` — executable smoke tests using Java assertions.

## Requirements
- JDK 17 or later
- Git (only needed to publish the project)

## Run
From the project root:

```bash
javac -d out src/model/*.java src/Main.java src/test/MainTest.java
java -cp out Main
java -ea -cp out MainTest
```

## GitHub submission
1. Replace `ADD_YOUR_STUDENT_ID` above with your actual student ID.
2. Create a **public** GitHub repository.
3. From this folder, run:

```bash
git init
git add .
git commit -m "Initial commit: Java diagram implementation"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git
git push -u origin main
```

4. Submit the repository URL through the Google Form provided by your instructor.

## Note
This implementation is based on the class names and project structure in the assignment message. The UML diagram itself was not included in the message received here, so compare the attributes, method signatures, visibility, and relationships against the original diagram before submitting.
