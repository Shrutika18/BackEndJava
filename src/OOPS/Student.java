package OOPS;

import OOPS.Inheritance.Person;

import java.util.Scanner;

public class Student
{
    int id;
    String name;
    int age;

    void show()
    {
        System.out.println("I am in show method");
    }

    public static void main(String[] args)
    {
        Student student;
        student = new Student();

        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.age);

        student.show();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Name is:" +name);

        System.out.println("Enter your id:");
        int id = sc.nextInt();
        System.out.println("Id is:" +id);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Age is:" +age);
    }
}
