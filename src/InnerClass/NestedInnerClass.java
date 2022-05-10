package InnerClass;

public class NestedInnerClass {
    void show() {
        System.out.println("in show method");
    }

    class Inner {
        void display() {
            System.out.println("in display method");
        }

        static void m1() {
            System.out.println("in m1");
        }

        class Inner2 {

        }
    }
}
    class NestedInnerClassImpl
    {
        public static void main(String[] args)
        {
            NestedInnerClass nestedInnerClass = new NestedInnerClass();
            nestedInnerClass.show();

            NestedInnerClass.Inner inner = nestedInnerClass.new Inner();
            NestedInnerClass.Inner.m1();
        }
    }

