package Array;

import java.lang.reflect.Array;

public class ArrayFeatures {
    public ArrayFeatures()  {
        System.out.println("\n-----------------------\nArrayFeatures: ");
        //manipulating and reading a final array using reflections
        final int[] finalArray = {0, 1, 2};
        System.out.println("final array at index 0 before reflection: "+ Array.get(finalArray,0));
        Array.set(finalArray,0,42);
        System.out.println("private final array after  at index 0 reflection: "+ Array.get(finalArray,0));
        //creating an array using reflection
        Object newInstance = Array.newInstance(Integer.class,2);
        System.out.println("int array created via \"Array.newInstance\": "+newInstance);


    }
}
