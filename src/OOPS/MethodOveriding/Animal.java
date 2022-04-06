package OOPS.MethodOveriding;

public class Animal
{
    void move()
    {
        System.out.println("Moving....");
    }

    void eat()
    {
        System.out.println("Eating...");
    }
}

class dog extends Animal
{
    void move()
    {
        System.out.println("Moving...");
    }

    void eat()
    {
        System.out.println("Eating...");
    }
}

class AnimalImpl
{
    public static void main(String[] args)
    {
        Animal animal;
        animal = new dog();
        animal.move();
        animal.eat();
    }
}
