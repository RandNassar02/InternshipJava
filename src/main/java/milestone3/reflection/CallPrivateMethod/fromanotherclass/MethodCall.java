package milestone3.reflection.CallPrivateMethod.fromanotherclass;

import java.lang.reflect.Method;

public class MethodCall {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("reflection.CallPrivateMethod.fromanotherclass.A");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}
