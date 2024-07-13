package ManipulateObject;

import AccessObject.DummyAccess;

import java.lang.reflect.Field;

public class ManipulateObjectFeatures {
    public ManipulateObjectFeatures() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("\n-----------------------\nManipulateObjectFeatures: ");
        DummyMO dummyObject = new DummyMO();
        Field dummyField = DummyMO.class.getDeclaredField("field");
        dummyObject.print();
        dummyField.setAccessible(true);
        dummyField.set(dummyObject,"This field got touched by a Reflection Call");
        dummyObject.print();
    }
}
