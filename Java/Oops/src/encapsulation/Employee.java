package encapsulation;

// Class 1: Employee
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) {
        if(name != null && !name.isEmpty()) this.name = name;
    }

    public int getAge() { return age; }
    public void setAge(int age) { if(age > 18) this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { if(salary > 0) this.salary = salary; }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

// Class 2: Department
class Department {
    private String deptName;
    private Employee manager;

    public Department(String deptName, Employee manager) {
        this.deptName = deptName;
        this.manager = manager;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { if(deptName != null) this.deptName = deptName; }

    public Employee getManager() { return manager; }
    public void setManager(Employee manager) { this.manager = manager; }

    public void displayDeptInfo() {
        System.out.println("Department: " + deptName);
        System.out.print("Manager Info → ");
        manager.displayInfo();
    }
}
