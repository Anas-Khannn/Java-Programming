import java.util.Scanner;

// Base class
class Employee {

    // Common attributes
    private String name;
    private double salary;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method for calculating salary
    public void calculatingSalary() {
        
        System.out.println("Salary calculation method needs to be implemented by derived class.");
    }
}

// Derived class for employees
class HourlyEmployee extends Employee {

    // Data Members
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatingSalary() {
        double salary = hourlyRate * hoursWorked;
        setSalary(salary);
        System.out.println("Salary for hourly employee " + getName() + " is: " + salary);
    }
}

class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public void calculatingSalary() {
        double salary = annualSalary / 12;
        setSalary(salary);
        System.out.println("Salary for salaried employee " + getName() + " is: " + salary);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for hourly employee
        System.out.println("Enter employee name:");
        String hourlyName = scanner.nextLine();
        System.out.println("Enter hourly rate:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter hours worked:");
        double hoursWorked = scanner.nextDouble();

        // Creating hourly employee object
        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyName, hourlyRate, hoursWorked);

        // Input 
        System.out.println("Enter salaried employee name:");
        scanner.nextLine(); // Consume newline
        String salariedName = scanner.nextLine();
        System.out.println("Enter annual salary:");
        double annualSalary = scanner.nextDouble();

        
        SalariedEmployee salariedEmployee = new SalariedEmployee(salariedName, annualSalary);

        // Calculating and display salaries
        hourlyEmployee.calculatingSalary();
        salariedEmployee.calculatingSalary();

        scanner.close();
    }
}
