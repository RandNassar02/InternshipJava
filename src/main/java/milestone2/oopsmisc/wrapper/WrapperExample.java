package milestone2.oopsmisc.wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

        //Autoboxing: Converting primitives into objects
        Byte byteObj=b;
        Short shortObj=s;
        Integer intObj=i;
        Long longObj=l;
        Float floatObj=f;
        Double doubleObj=d;
        Character charObj=c;
        Boolean boolObj=b2;

        //Printing objects
        System.out.println("---Autoboxing--");
        System.out.println("byte object="+byteObj);
        System.out.println("short object="+shortObj);
        System.out.println("int object="+intObj);
        System.out.println("long object="+longObj);
        System.out.println("float object="+floatObj);
        System.out.println("double object="+doubleObj);
        System.out.println("char object="+charObj);
        System.out.println("bool object="+boolObj);

        //Unboxing: Converting Objects to Primitives
        byte byteValue=byteObj;
        short shortValue=shortObj;
        int intValue=intObj;
        long longValue=longObj;
        float floatValue=floatObj;
        double doubleValue=doubleObj;
        char charValue=charObj;
        boolean booleanValue=boolObj;

        //Printing primitives
        System.out.println("---Unboxing---");
        System.out.println("byte value="+byteValue);
        System.out.println("short value="+shortValue);
        System.out.println("int value="+intValue);
        System.out.println("long value="+longValue);
        System.out.println("float value="+floatValue);
        System.out.println("double value="+doubleValue);
        System.out.println("char value="+charValue);
        System.out.println("boolean value="+booleanValue);

    }
}
