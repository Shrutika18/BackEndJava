package String;

public class StringDemo
{
    int a = 10;
    static int b =20;

    public static void main(String[] args)
    {
        int c = 30;
        char[] ch = {'a','e','i','o','u'};
        String str1 = String.valueOf(ch);
        String str2 = "Java";
        String str3 = new String("Java");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
