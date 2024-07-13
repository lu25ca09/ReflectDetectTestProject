package AccessObject;

import java.lang.reflect.Field;

public class AccessObjectFeatures {


    public AccessObjectFeatures() throws ClassNotFoundException, IllegalAccessException {
        System.out.println("\n-----------------------\nAccessObjectFeatures: ");
        Field[] dummyFields = DummyAccess.class.getDeclaredFields();
        DummyAccess dummyAccess = new DummyAccess("42");
        for(Field field : dummyFields){
            field.setAccessible(true);
            System.out.println("Accessed "+field.get(dummyAccess));
        }

    }
}
