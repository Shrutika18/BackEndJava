package Keywords.ThisKeyword;

//4. used to pass as an argument in the method

public class B
{
    void m1( B b)
    {
        System.out.println("method m1 is invoked");
    }

    void m2()
    {
        m1(this);
    }

    public static void main(String[] args)
    {
        B b = new B();
        b.m2();
    }
}
