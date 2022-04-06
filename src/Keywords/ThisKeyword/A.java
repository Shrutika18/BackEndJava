package Keywords.ThisKeyword;

//3. used to invoke current class constructor

public class A
{
    int Rno;
    String name;

    A()
    {
        this("ABC");
        System.out.println("Default Constructor");
    }
    A(int Rno)
    {
        this();
        System.out.println("Roll no:" + Rno);
    }
    A(String name)
    {
        System.out.println("Name is: "+ name);
    }

    public static void main(String[] args)
    {
        A a = new A(1);
    }
}
