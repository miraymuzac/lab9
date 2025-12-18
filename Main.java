import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);
        try {
            System.out.println("--- Loading Employees from 'q3.txt' ---");
            manager.loadEmployeesFromFile("q3.txt");
            System.out.println("\n--- Current Employee List ---");
            manager.displayEmployees();
            System.out.println("\n--- Searching for 'Gandalf the Grey' ---");
            manager.searchEmployee("Gandalf the Grey");
            System.out.println("\n--- Adding New Employee 'Legolas' ---");
            manager.addEmployee("Legolas", "Archery", "legolas@mirkwood.com");
            System.out.println("\n--- Updated Employee List ---");
            manager.displayEmployees();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}