package OOPS.ParameterisedConstructor;

public class Employee
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, double salary)
    {
        this.id = id;
        this.salary = salary;
    }

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class EmployeeImpl
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(1,"Krishna", 50000);
        employee.display();

        Employee employee1 = new Employee(2, "Shrutika", 40000);
        employee1.display();

        Employee employee2 = new Employee(3, "Dipali", 70000);
        employee2.display();
    }
}
