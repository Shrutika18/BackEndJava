package Statements.LoopStatement;

public class ForLoop
{
    public static void main(String[] args)
    {
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println("Hello"+i);
            break;
        }

        //Nested ForLoop
        for (int i = 1; i <=3 ; i++)
        {
            for (int j = 1; j <=3 ; j++)
            {
                System.out.println("i ="+i + "& j=" +j);
            }
        }
    }
}
