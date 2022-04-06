package Keywords.ThisKeyword;

// 5. used to pass as an argument in constructor call

public class C
{
    int i = 10;
    C(A1 a1)
    {
        System.out.println("in class B constructor ");
    }
}
class A1
{
    int i = 10;
    A1()
    {
        C c = new C(this);
    }

    public static void main(String[] args)
    {
        A1 a = new A1();
    }
}
