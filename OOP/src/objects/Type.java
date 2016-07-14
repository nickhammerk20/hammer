package objects;

abstract class Type extends Enum { 
    public static Type[] values() { 
        return (Type[]) $VALUES.clone(); 
    } 
 
    public static Type valueOf(String name) { 
        return (Type) Enum.valueOf(t / T$Type, name); 
    } 
 
    public boolean isPrimitive() { 
        return primitive; 
    } 
 
    public abstract Object parse(String s); 
 
    public static final Type INT; 
    public static final Type INTEGER; 
    public static final Type STRING; 
    boolean primitive; 
    private static final Type $VALUES[]; 
 
    static { 
        INT = new Type("INT", 0, true) { 
            public Object parse(String string) { return Integer.valueOf(string); } 
        }; 
        INTEGER = new Type("INTEGER", 1, false) { 
            public Object parse(String string) { return Integer.valueOf(string); } 
        }; 
        STRING = new Type("STRING", 2, false) { 
            public Object parse(String string) { return string; } 
        }; 
 
        $VALUES = (new Type[]{ 
                INT, INTEGER, STRING 
        }); 
    } 
 
    private Type(String s, int i, boolean primitive) { 
        super(s, i); 
        this.primitive = primitive; 
    } 
} 