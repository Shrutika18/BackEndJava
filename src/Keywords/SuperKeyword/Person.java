package Keywords.SuperKeyword;

public class Person
{
    int id;
    String name;
    String mobile;

    public Person(int id, String name, String mobile)
    {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }
}

class Employee extends Person
{
    float salary;

    Employee(int id, String name, String mobile, float salary)
    {
        super(id,name,mobile);
        this.salary = salary;
    }

    void display()
    {
        System.out.println(super.id +" "+super.name+" "+salary + " "+mobile);
    }
}
class PersonImpl
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,"Shrutika","3252235723", 100000);
        e1.display();
    }
}
