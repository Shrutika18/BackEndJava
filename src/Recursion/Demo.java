package Recursion;

public class Demo
{
    static  int add(int no)
    {
        if(no > 0)
        {
            return no + add(no - 1);
        }
        return no;
    }

    public static void main(String[] args)
    {
        System.out.println(Demo.add(5));

    }
}
