package String;

import javax.management.monitor.StringMonitor;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s1 = "Shrutika";
        String s2 = "Bagal";
        //length
        System.out.println(s1.length());
        //uppercase
        System.out.println(s1.toUpperCase());
        //lowercase
        System.out.println(s2.toLowerCase());
        //substring
        System.out.println(s1.substring(2,5));
        //charAt
        System.out.println(s1.charAt(7));
        //isEmpty
        System.out.println(s2.isEmpty());
        //concat
        System.out.println(s1.concat(s2));
        //startsWith
        System.out.println(s1.startsWith(s2));
        //endWith
        System.out.println(s1.endsWith(s2));
        //trim
        System.out.println(s1.trim());
        //replace
        System.out.println(s1.replace('1','s'));



    }
}
