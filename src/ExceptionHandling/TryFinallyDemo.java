package ExceptionHandling;

public class TryFinallyDemo
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("Im in finally block");
        }
        System.out.println("Remaining Code");
    }
}
