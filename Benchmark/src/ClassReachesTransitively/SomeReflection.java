package ClassReachesTransitively;

import java.lang.reflect.Array;

public class SomeReflection {
    public SomeReflection(){}
    public void foo(){
        final int[] temp = {42,0,42};
        Array.set(temp,0,-1);
        if (temp[0]==-1)System.out.println("Reflection successful");
    }
}
