import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Shailesh", 1000.0));
        employeeList.add(new Employee(2, "Aman", 1500.0));
        employeeList.add(new Employee(3, "Rahul", 1200.0));

        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
    }
}