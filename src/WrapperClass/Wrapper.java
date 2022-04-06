package WrapperClass;

public class Wrapper
{
    public static void main(String[] args)
    {
        Integer i = 3;
        System.out.println(i);

        int ii = i.intValue();
        ii = i;

        int j = 5;
        Integer jj = Integer.valueOf(j);
        jj = j;

        Integer a = 5;
        System.out.println(ii);

    }
}
