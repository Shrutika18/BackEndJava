package OOPS.Encapsulation;

public class Employee
{
    private int id;
    private String name;
    private double salary;
    private double bonus;
    private String email;


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getBonus()
    {
        return 5000;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    double calculateSalary()
    {
        double totalSalary = salary + getBonus();
        return totalSalary;
    }

    public void display()
    {
        System.out.println("ID: "+getId());
        System.out.println("Name:"+getName());
        System.out.println("Email:"+getEmail());
        System.out.println("Total Salary:"+getSalary());
    }
}
class EmployeeImpl
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Shrutika");
        employee.setEmail("Shrutika@gmail.com");
        employee.setSalary(50000);
        employee.display();
    }
}
