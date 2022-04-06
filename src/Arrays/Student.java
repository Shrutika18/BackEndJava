package Arrays;

public class Student
{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

    class StudentImpl
    {
        public static void main(String[] args)
        {
            Student s[];
            s = new Student[5];
            s[0] = new Student(1,"Shrutika");
            s[1] = new Student(2,"Krishna");
            s[2] = new Student(3, "Dipali");
            s[3] = new Student(4, "Amogh");
            s[4] = new Student(5,"Paritosh");

            for (int i = 0; i <s.length ; i++)
            {
                System.out.println("Index"+i+"Roll No"+s[i].getRollNo()+"Name"+s[i].getName());
            }

            for (Student student : s)
            {
                System.out.println(student.getName()+""+student.getRollNo());
            }

            for (int i = 1; i < s.length ; i++)
            {
                if (i%2 == 0)
                {
                    System.out.println("Index"+i+"Roll No"+s[i].getRollNo()+"Name"+s[i].getName());
                }
            }

        }
    }

