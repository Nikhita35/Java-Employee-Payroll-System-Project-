import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}


//And for 10 Data we have this code
import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Adding 10 employees (Full-time and Part-time)
        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        FullTimeEmployee emp2 = new FullTimeEmployee("Alice Brown", 102, 4500.0);
        FullTimeEmployee emp3 = new FullTimeEmployee("David Clark", 103, 4800.0);
        FullTimeEmployee emp4 = new FullTimeEmployee("Sophia Green", 104, 5300.0);
        FullTimeEmployee emp5 = new FullTimeEmployee("Michael White", 105, 5500.0);
        
        PartTimeEmployee emp6 = new PartTimeEmployee("Jane Smith", 106, 30, 15.0);
        PartTimeEmployee emp7 = new PartTimeEmployee("Emma Davis", 107, 25, 20.0);
        PartTimeEmployee emp8 = new PartTimeEmployee("Oliver King", 108, 40, 18.0);
        PartTimeEmployee emp9 = new PartTimeEmployee("Isabella Hall", 109, 35, 17.0);
        PartTimeEmployee emp10 = new PartTimeEmployee("Lucas Adams", 110, 45, 16.0);

        // Adding employees to the payroll system
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);
        payrollSystem.addEmployee(emp7);
        payrollSystem.addEmployee(emp8);
        payrollSystem.addEmployee(emp9);
        payrollSystem.addEmployee(emp10);

        // Displaying employee details
        System.out.println("Employee Details:");
        payrollSystem.displayEmployees();

        // Removing an employee
        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        // Displaying remaining employee details
        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}


Output we get here is :

Employee Details:
Employee [name=John Doe, id=101, salary=5000.0]
Employee [name=Alice Brown, id=102, salary=4500.0]
Employee [name=David Clark, id=103, salary=4800.0]
Employee [name=Sophia Green, id=104, salary=5300.0]
Employee [name=Michael White, id=105, salary=5500.0]
Employee [name=Jane Smith, id=106, salary=450.0]
Employee [name=Emma Davis, id=107, salary=500.0]
Employee [name=Oliver King, id=108, salary=720.0]
Employee [name=Isabella Hall, id=109, salary=595.0]
Employee [name=Lucas Adams, id=110, salary=720.0]

Removing Employee...

Remaining Employee Details:
Employee [name=Alice Brown, id=102, salary=4500.0]
Employee [name=David Clark, id=103, salary=4800.0]
Employee [name=Sophia Green, id=104, salary=5300.0]
Employee [name=Michael White, id=105, salary=5500.0]
Employee [name=Jane Smith, id=106, salary=450.0]
Employee [name=Emma Davis, id=107, salary=500.0]
Employee [name=Oliver King, id=108, salary=720.0]
Employee [name=Isabella Hall, id=109, salary=595.0]
Employee [name=Lucas Adams, id=110, salary=720.0]

=== Code Execution Successful ===
