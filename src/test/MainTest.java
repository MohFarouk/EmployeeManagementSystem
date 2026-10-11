import model.*;
import java.time.LocalDate;

/**
 * Lightweight executable smoke test (no external test framework required).
 * Run this class to verify salary calculations and department membership.
 */
public class MainTest {
    public static void main(String[] args) {
        Department department = new Department(1, "Testing");

        Employee monthly = new MonthlyEmployee(
                1, "Test Monthly", Gender.MALE, LocalDate.of(2025, 1, 1),
                department, 10000);
        Employee commission = new CommissionEmployee(
                2, "Test Commission", Gender.FEMALE, LocalDate.of(2025, 1, 1),
                department, 5000, 20000, 0.10);
        Employee hourly = new HourlyEmployee(
                3, "Test Hourly", Gender.OTHER, LocalDate.of(2025, 1, 1),
                department, 45, 100);

        department.addEmployee(monthly);
        department.addEmployee(commission);
        department.addEmployee(hourly);

        assert Math.abs(monthly.calculateSalary() - 10000) < 0.001;
        assert Math.abs(commission.calculateSalary() - 7000) < 0.001;
        assert Math.abs(hourly.calculateSalary() - 4750) < 0.001;
        assert department.getEmployees().size() == 3;
        assert Math.abs(department.getTotalMonthlyPayroll() - 21750) < 0.001;

        System.out.println("All smoke tests passed.");
    }
}
