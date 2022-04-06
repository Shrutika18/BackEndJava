package Recursion;

public class RDemo
{
    Integer no = 1;
    void show()
    {
        System.out.println("Hiii" + no);
        while (no< 5)
        {
            no++;
            show();
        }
    }

    public static void main(String[] args)
    {
        RDemo rDemo = new RDemo();
        rDemo.show();
    }
}
