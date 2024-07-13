package ParameterSeverity;

import InvokeMethod.DummyInvoke;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ParameterSeverityTest {
    public ParameterSeverityTest() throws InvocationTargetException, IllegalAccessException {
        System.out.println("\n-----------------------\nParameterSeverityTest: ");
        final int[] finalArray = {0, 1, 2};
        String[] strings = {"42","hallo welt"};
        System.out.println(Arrays.toString(finalArray));
        Array.set(finalArray,0,42);
        int value = 0;
        value = 43;
        manipulateArray(finalArray,1,value);
        System.out.println(Arrays.toString(finalArray));

    }

    private void manipulateArray(int[] array, int i, int v) {
        Array.set(array,i,v);
    }


}
