package Keywords.ThisKeyword;

//6. used to return current class instance

public class D
{
    D getD()
    {
        System.out.println("In P");
        return  this;
    }
}
class Test
{
    public static void main(String[] args) {
        D d = new D();
        d.getD();
    }
}
