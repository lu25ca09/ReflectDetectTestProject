package ConstructObject;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructObjectFeatures {


    public ConstructObjectFeatures() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("\n-----------------------\nConstructObjectFeatures: ");
        // testing method <Constructor>.newInstance(<Object*>)
        Class<Dummy> dummyClass = Dummy.class;
        Constructor<?>[] dummyConstructors = dummyClass.getDeclaredConstructors();
        dummyConstructors[0].setAccessible(true);
        dummyConstructors[1].setAccessible(true);
        Dummy dummyObject = (Dummy) dummyConstructors[0].newInstance();
        dummyObject.print();
        dummyObject = (Dummy) dummyConstructors[1].newInstance("42");
        dummyObject.print();
        // testing method <Class>.newInstance()
        dummyObject = dummyClass.newInstance();
        dummyObject.print();
    }
}
