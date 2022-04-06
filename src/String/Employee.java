package String;

public class Employee
{
    int id;
    String name;

    void insertData(Integer i, String nm)
    {
        id = i;
        name = nm;

//        for (Employee e : arrayEmployee)
//        {
//            if (compareTo)
//            {
//
//            }
//        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}
class EmployeeImpl
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        //employee.display();
        employee.insertData(2,"Shrutika");
        System.out.println(employee);

    }
}
