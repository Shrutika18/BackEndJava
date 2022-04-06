package Keywords.FinalKeyword;

public class Student
{
    int id;
    String name;

    final String PAN_NO = "ABC4657DS";
    final String AADHAR_NO;
    final static String MOBILE_NO;

    Student()
    {
        AADHAR_NO = "2365268768473743";
    }

    static
    {
        MOBILE_NO = "27836486234283";
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s.PAN_NO);
    }
}
