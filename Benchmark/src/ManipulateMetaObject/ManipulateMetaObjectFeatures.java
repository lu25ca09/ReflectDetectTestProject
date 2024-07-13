package ManipulateMetaObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ManipulateMetaObjectFeatures {
    public ManipulateMetaObjectFeatures() throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("\n-----------------------\nManipulateMetaObjectFeatures: ");
        Class<DummyMMO> dummyMetaObject = DummyMMO.class;
        Constructor<DummyMMO> dummyConstructor = dummyMetaObject.getDeclaredConstructor();
        Method dummyMethod = dummyMetaObject.getDeclaredMethod("print");
        Field dummyField  =  dummyMetaObject.getDeclaredField("field");
        dummyConstructor.setAccessible(true);
        dummyMethod.setAccessible(true);
        dummyField.setAccessible(true);
        DummyMMO dummyObject = dummyConstructor.newInstance();
        dummyMethod.invoke(dummyObject);
        System.out.println(dummyField.get(dummyObject));

    }
}
