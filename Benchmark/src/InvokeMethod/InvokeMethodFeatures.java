package InvokeMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodFeatures {

    public InvokeMethodFeatures() throws InvocationTargetException, IllegalAccessException {
        System.out.println("\n-----------------------\nInvokeMethodFeatures: ");
        Method[] dummyMethods = DummyInvoke.class.getDeclaredMethods();
        DummyInvoke dummyInvoke = new DummyInvoke();
        for (Method method : dummyMethods) {
            method.setAccessible(true);
            System.out.println(method.invoke(dummyInvoke));
        }
    }
}
