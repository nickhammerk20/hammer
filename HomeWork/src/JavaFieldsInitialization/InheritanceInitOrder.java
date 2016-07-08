package JavaFieldsInitialization;

public class InheritanceInitOrder {
    static class A {
        String a;
        A() {
            a = "a";
            System.out.println("a initialized");
            System.out.println("b=" + ((B)this).b);
        }
    }

    static class B extends A {
        String b;
        B() {
            b = "b";
            System.out.println("b initialized");
            System.out.println("b=" + b);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new B();
    }
}