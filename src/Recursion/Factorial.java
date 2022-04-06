package Recursion;

public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println("Fact = " + Factorial.fact(6));
    }
    static int fact(int no)
    {
        if (no > 1)
        {
            return no * fact(no - 1);
        }
        return no;
    }
}
