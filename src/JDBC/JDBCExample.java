package JDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student
{
    int RollNo;
    String name;
    String address;
    String section;
    String div;
    String schoolName;
}

public class JDBCExample
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        initialiseObject(students);
    }

    private static void initialiseObject(List<Student> students)
    {
        Student s1 = new Student();
        s1.RollNo = 1;
        s1.name = "";
        s1.address = "";
        s1.div = "";
        s1.section = "";
        s1.schoolName = "";

        Student s2 = new Student();
        s2.RollNo = 2;
        s2.name = "";
        s2.address = "";
        s2.section = "";
        s2.div = "";
        s2.schoolName = "";

        students.add(s1);
        students.add(s2);
        insert(students);
    }

    private static void insert(List<Student> students)
    {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Shrutika@18";
        for (Student s: students)
        {

            String query = "insert into Student values(?,?,?,?,?,?);";
        }
    }
}
