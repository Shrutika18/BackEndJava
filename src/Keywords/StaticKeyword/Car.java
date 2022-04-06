package Keywords.StaticKeyword;

public class Car
{
    static String CarName;
    String color;
    int wheels;

    Car()
    {
        color ="White";
        CarName = "Zest";
        wheels = 4;
        System.out.println("in constructor");
    }

    static
    {
        CarName = "Tata";
        System.out.println("In static block");
    }
    void show()
    {
        System.out.println(color+":"+wheels+":"+CarName);
    }
}
class CarTest
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.show();
    }
}
