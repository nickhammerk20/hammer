package JavaFieldsInitialization;



public class StaticInitializationTime {
    public static class C {
        static int i = value();
        static int value() {
            System.out.println("C.i initialized");
            return 1;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before class loading");
      //  Class.forName(C.class.getName());
        System.out.println("After class loading");
    }
}
