package ExceptionHandling;

import javax.swing.*;

public class SBIBankHw
{
    private Double amount = 0d;

    void withdrawAmount(Double withdraw) {
        if (amount < withdraw) {
            try {
                throw new UserDefinedException("Insufficient Balance");
            } catch (UserDefinedException e) {
                e.printStackTrace();
            }
        } else {
            amount = amount - withdraw;
            System.out.println("After withdrawal" + amount);
        }
    }

    void deposit(Double deposit) {
        if (deposit > 0) {
            amount = amount + deposit;
            System.out.println("After deposit " + amount);
        }
    }

}
class SBIBankHwImpl
{
    public static void main(String[] args)
    {
        SBIBankHw sbiBankHw = new SBIBankHw();
        sbiBankHw.deposit(1000d);
        sbiBankHw.withdrawAmount(5000d);

    }
}
