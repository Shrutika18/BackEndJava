package ExceptionHandling;

public class VoteHw
{
    void checkAgeCriteria(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("You are not eligible for voting");
        }
        else
        {
            System.out.println("You are eligible for vote");
        }
    }

    public static void main(String[] args)
    {
        VoteHw voteHw = new VoteHw();
        voteHw.checkAgeCriteria(18);
        System.out.println("Remaining Code");
    }
}
