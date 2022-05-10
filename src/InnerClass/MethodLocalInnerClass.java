package InnerClass;

public class MethodLocalInnerClass
{
    void outerMethod()
    {
        System.out.println("in out method");

        class Inner{
            void innerMethod()
            {
                System.out.println("in inner method");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
class MethodLocalInnerClassImpl
{
    public static void main(String[] args)
    {
        MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
        methodLocalInnerClass.outerMethod();
    }
}
