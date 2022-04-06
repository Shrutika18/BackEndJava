package Keywords.SuperKeyword;

public class Vehicle
{
    void v1()
    {
        System.out.println("Im in a vehicle class");
    }
}
class Bike extends Vehicle
{
    void b1()
    {
        System.out.println("Im in bike class");
    }
}

class VehicleImpl
{
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.b1();
    }

}
