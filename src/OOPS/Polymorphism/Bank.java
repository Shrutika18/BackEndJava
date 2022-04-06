package OOPS.Polymorphism;

public class Bank
{
    float getInterest()
    {
        return 0f;
    }
}
class HSBC extends Bank
{
    float getInterest()
    {
        return 8.3f;
    }
}
class KotakMahindra extends Bank
{
    float getInterest()
    {
        return 7.5f;
    }
}
class BankImpl
{
    public static void main(String[] args)
    {
        Bank bank;

        bank = new HSBC();
        System.out.println("HSBC Interset:"+bank.getInterest());

        bank = new KotakMahindra();
        System.out.println("KotakMahindra Interest:"+bank.getInterest());
    }
}
