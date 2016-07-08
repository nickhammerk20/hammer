package JavaFieldsInitialization;


public class ClassFieldsInitOrder {
    static int i1 = initialize("i0");

    static int i2;
    static { i2 = initialize("i1"); }

    static int i3 = initialize("i2");

    static int i4;
    static { i4 = initialize("i4"); }

    static int initialize(String name) {
        System.out.println(name);
        return 0;
    }

    public static void main(String[] args) {}
}