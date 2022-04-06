package Statements.DecisionMakingStatements;

public class SwitchCase
{
    public static void main(String[] args)
    {
        int count = 5;
        switch (count)
        {
            case 1:
                System.out.println("Counter is 1");
                break;
            case 2:
                System.out.println("Counter is 2");
                break;
            case 3:
                System.out.println("Counter is 3");
                break;
            case 4:
                System.out.println("Counter is 4");
                break;
            case 5:
                System.out.println("Counter is 5");
                break;
            default:
                System.out.println("Default"+count);
        }
    }
}
