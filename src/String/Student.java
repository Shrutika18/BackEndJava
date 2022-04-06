package String;

import com.sun.source.doctree.SeeTree;

public class Student
{
    private Integer id;
    private String name;
    private String schoolName;
    private  String std;
    private String div;

    void insertData(Integer i, String nm, String sn, String s, String d)
    {
        id = i;
        name = nm;
        schoolName = sn;
        std = s;
        div = d;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", std='" + std + '\'' +
                ", div='" + div + '\'' +
                '}';
    }

    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("name:"+name);
        System.out.println("schoolName:"+schoolName);
        System.out.println("Std:"+std);
        System.out.println("div:"+div);
    }
}
class StudetntImpl
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.insertData(1,"Shrutika", "IES","XVI","A");
        System.out.println(s1);
    }
}
