package OOPS.DefaultConstructor;

public class Student
{
    int RNo;
    String name;
    double fees;
    Student()
    {
        System.out.println("In Default constructors");
    }

    void show()
    {
        System.out.println("Roll No: "+RNo);
        System.out.println("Name:"+ name);
        System.out.println("Fees: "+fees);
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        s.show();

    }
}
