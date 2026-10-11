import model.*;
import java.time.LocalDate;

/** Demo entry point for the Employee Management System. */
public class Main {
    public static void main(String[] args) {
        Department engineering = new Department(10, "Engineering");

        Employee monthly = new MonthlyEmployee(
                101, "Mariam Hassan", Gender.FEMALE,
                LocalDate.of(2024, 3, 1), engineering, 18000);

        Employee commission = new CommissionEmployee(
                102, "Omar Ali", Gender.MALE,
                LocalDate.of(2023, 8, 15), engineering,
                7000, 50000, 0.08);

        Employee hourly = new HourlyEmployee(
                103, "Nour Ahmed", Gender.OTHER,
                LocalDate.of(2025, 1, 10), engineering, 45, 150);

        engineering.addEmployee(monthly);
        engineering.addEmployee(commission);
        engineering.addEmployee(hourly);

        System.out.println("=== Employee Management System ===");
        for (Employee employee : engineering.getEmployees()) {
            System.out.println(employee);
        }
        System.out.printf("%nTotal department payroll: %.2f%n",
                engineering.getTotalMonthlyPayroll());
    }
}
