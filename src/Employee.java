package src;

public class Employee {
    
    // Instance variables
    public int employeeId;
    public String employeeName;
    public String employeeRole;
    
    // Class variables
    public static String department;
    public static String noOfEmployees;
    public static String employeeManager;
    
    // Constructor
    public Employee(int id, String name, String role) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeRole = role;
    }
    
    // Method to introduce the employee
    public void introduce() {
        System.out.println("Hello, I'm " + employeeName + ", a " + employeeRole + " under " + employeeManager);
    }
    
    // Method to report the department
    public void report() {
        System.out.println("I'm working for the " + department + " department");
    }
    
    // Method to indicate the employee manager
    public void communicate() {
        System.out.println("I communicate with " + employeeManager + " in case of a problem");
    }
    
    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee(1, "John Doe", "Software Engineer");
        
        // Set department information
        Employee.department = "Engineering";
        Employee.employeeManager = "Jane Smith";
        
        // Introduce the employee
        employee.introduce();
        // Report the department
        employee.report();
        // Communicate with employee manager
        employee.communicate();
    }
}
