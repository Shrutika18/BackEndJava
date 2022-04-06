package Keywords.StaticKeyword;

public class CounterDemo
{
    static int counter = 0;
    CounterDemo()
    {
        counter++;
        System.out.println("counter is:"+counter);
    }
}
class CounterTest
{
    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
        CounterDemo c4 = new CounterDemo();
    }
}
