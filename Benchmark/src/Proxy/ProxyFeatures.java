package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFeatures {
    public ProxyFeatures() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("\n-----------------------\nProxyFeatures: ");
        //testing newProxyInstance()
        DummyImplementation dummyImplementation = new DummyImplementation();
        DummyInvocationHandler handler = new DummyInvocationHandler();
        System.out.println("calling the interface Methods implemented by DummyImplementation without Proxy:");
        dummyImplementation.hello();
        dummyImplementation.bye();
        ClassLoader dummyClassLoader = dummyImplementation.getClass().getClassLoader();
        Class<?>[] interfaces = dummyImplementation.getClass().getInterfaces();
        DummyInterface dummyProxy = (DummyInterface) Proxy.newProxyInstance(dummyClassLoader,interfaces,handler);

        System.out.println("calling the interface Methods implemented by DummyImplementation with Proxy:");
        dummyProxy.hello();
        dummyProxy.bye();

        // testing getProxyClass() and getInvocationHandler()
        System.out.println("Creating an Instance of DummyInterface by using getProxyClass and invoking its methods: ");
        Class<?> dummyProxyClass = Proxy.getProxyClass(dummyClassLoader,new Class[]{DummyInterface.class});
        DummyInterface dummyProxy2 = (DummyInterface) dummyProxyClass.getConstructor(new Class[]{InvocationHandler.class}).newInstance(new Object[]{Proxy.getInvocationHandler(dummyProxy)});
        dummyProxy2.hello();
        dummyProxy2.bye();

    }

    static class DummyInvocationHandler implements InvocationHandler {


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName()+" got implemented by the Reflection Library");
            return null;
        }
    }
}
