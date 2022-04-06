package String;

public class StringComparison
{
    public static void main(String[] args)
    {
        String s1 = "Mumbai";
        String s2 = "pune";
        String s3 = new String("Pune");
        String s4 = "Pune";
        String s5 = "Sangli";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s5));
        System.out.println(s5.compareTo(s2));

    }
}
