

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException, InvocationTargetException, NoSuchMethodException {
           unsoundInvoke();
    }

    public static void unsoundInvoke() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        FooBar fooBar = new FooBar();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String methodToInvoke = reader.readLine();
        Method method = fooBar.getClass().getDeclaredMethod(methodToInvoke);
        method.setAccessible(true);
        method.invoke(fooBar);
    }
}

/*
RunReflections r = new RunReflections();
            Cat cat = new Cat("anna",42);
            System.out.println(cat+"\nReflection call to change private final name of the cat object");
            r.changeCat(cat);
            System.out.println(cat);
 */
