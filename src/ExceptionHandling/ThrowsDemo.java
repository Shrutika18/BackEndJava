package ExceptionHandling;

public class ThrowsDemo
{
    void m1() throws UserDefinedException
    {
        throw  new UserDefinedException("Exception occur");
    }

    void m2() throws UserDefinedException
    {
        m1();
    }

    void m3()
    {
        try
        {
            m2();
        }
        catch (UserDefinedException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.m3();
    }
}
