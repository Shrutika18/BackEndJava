package Keywords.ThisKeyword;

// 2. used to invoke current class method(implicitly)

public class Student
{
    void m1()
    {
        System.out.println("In m1");
    }

    void m2()
    {
        System.out.println("In m2");
    }

    public static void main(String[] args)
    {
        Student student = new Student();
        student.m1();
        student.m2();
    }
}
