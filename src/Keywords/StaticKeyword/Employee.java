package Keywords.StaticKeyword;

public class Employee
{
    int id;
    String name;

    static String ceo;

    Employee()
    {
        id = 1;
        name = "Shrutika";
        System.out.println("in constructor");
    }

    static
    {
        ceo = "Sagar";
        System.out.println("in static block");
    }

    void show()
    {
        System.out.println(id+":"+name+":"+ceo);
    }
}

class EmployeeImpl
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 2;
        e1.name = "Krishna";

        Employee e2 =  new Employee();

        e1.show();
        e2.show();
    }
}
