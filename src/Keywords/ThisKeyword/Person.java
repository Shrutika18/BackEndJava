package Keywords.ThisKeyword;

// 1. used to refer current class instance variable

public class Person
{
    int pid;
    String name;

    void setPid(int pid)
    {
        this.pid = pid;
    }

    void setName(String name)
    {
        this.name = name;
    }

    void show()
    {
        System.out.println("PID is:"+pid);
        System.out.println("Pname is: "+ name);
    }
}
class PersonImpl
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setPid(1);
        p1.setName("shru");
        p1.show();

        Person p2 = new Person();
        p2.setPid(2);
        p2.setName("krishna");
        p2.show();
    }
}
