import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class EmployeeManager {
    private Employee[] employees;
    private int counter;
    private String filePath;

    EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        counter = 0;
        filePath = "";
    }

    public void loadEmployeesFromFile(String filePath) throws IOException {
        this.filePath = filePath;
        Scanner reader = new Scanner(Paths.get(filePath));
        while (reader.hasNextLine()) {
            String[] splitLine = reader.nextLine().split(",");
            employees[counter] = new Employee(splitLine[0].trim(), splitLine[1].trim(), splitLine[2].trim());
            counter++;
        }
    }

    public void displayEmployees() {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public void addEmployee(String name, String department, String mail) {
        employees[counter] = new Employee(name, department, mail);
        counter++;
        Formatter f = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath, true);
            f = new Formatter(fw);
            f.format("%s,%s,%s\n", name, department, mail);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f != null) {
                f.close();
            }
        }
    }

    public void searchEmployee(String name) {
        for (int i = 0; i < counter; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println(employees[i].toString());
            }
        }
    }

}
