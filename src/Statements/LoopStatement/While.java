package Statements.LoopStatement;

public class While
{
    public static void main(String[] args)
    {
        //while loop
        int count = 1;
        while(count <= 10)
        {
            System.out.println("count is " + count);
            count++;
        }

        //infinite while loop
        int i = 1;
        System.out.println("table of 2:");
        while (i<=10)
        {
            System.out.println(2*i);
            i++;
        }

    }
}
