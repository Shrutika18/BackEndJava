package Statements.LoopStatement;

public class DoWhile
{
    public static void main(String[] args)
    {
        int count = 1;
        do{
            System.out.println(count);
            count++;
        }while (count>=5);

        do{
            System.out.println("infinite");
        }while (true);
    }
}
