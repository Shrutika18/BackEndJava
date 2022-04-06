package Basics;

public class Operators
{
    public static void main(String[] args)
    {
        //unary operators
        int a = 10;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        int x = 20;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int m = 20;
        int n = 20;
        int p = 10;
        System.out.println(m++ + ++m);
        System.out.println(n++ + ++n);
        System.out.println(~p);

        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);

        //arithmetic operators
        m = 20;
        n = 20;
        System.out.println(m+n);
        System.out.println(m-n);
        System.out.println(m*n);
        System.out.println(m/n);

        //shift operators
        a = 10;
        System.out.println(a>>2);
        System.out.println(20>>2);
        System.out.println(30>>3);

        m = 10;
        n = 5;
        p = 15;

        //logical AND(&)
        System.out.println(m<n && m<p);

        //Bitwise AND(&)
        System.out.println(m<n & m<p);

        System.out.println(m<n && m++ <p);
        System.out.println(m<p && n<m);

        //logical OR(||)
        System.out.println(m>n || m<p);
        System.out.println(m<p || n<p);

        //Bitwise OR(|)
        System.out.println(a>n | ++p>n);

        //Ternary Operator
        System.out.println(m<n ? "m is min" : "m is max");
        int min = n<p ? n:p;
        System.out.println(min);
        if (m<n)
            System.out.println("m is min");
        else
            System.out.println("m is max");

        //assignment operator
        m = 10;
        n = 15;

        m+=5;
        n-=5;
        m*=2;
        n/=3;
    }
}
