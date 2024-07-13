
import java.lang.reflect.Field;

public class RunReflections {
    public RunReflections(){}
    public void changeCat(Cat cat) throws NoSuchFieldException, IllegalAccessException {
        Field f = Cat.class.getDeclaredField("name");
        f.setAccessible(true);
        f.set(cat,"bob");
    }
}
