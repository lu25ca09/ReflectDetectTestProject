


import java.lang.reflect.*;
public class Test {
    private final int temp = 0;
    public static void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method sumInstanceMethod = Test.class.getMethod("publicSum", int.class,double.class);
        Method staticProductMethod = Test.class.getMethod("staticProduct", float.class,long.class);
        Method privateAndMethod = Test.class.getDeclaredMethod("privateAnd", boolean.class,boolean.class);
        Method protectedMaxMethod = Test.class.getDeclaredMethod("protectedMax", int.class,int.class);

        Test operationInstance = new Test();
        double resultSum  = (Double) sumInstanceMethod.invoke(operationInstance, 1, 3);
        assert resultSum == 4.0 : "reflect invoke of sum was not correct. returned result: "+ resultSum;
        System.out.println(resultSum);

        double resultProduct  = (Double) staticProductMethod.invoke(operationInstance, 6, 7);
        assert resultProduct == 42.0 : "reflect invoke of product was not correct. returned result: "+ resultProduct;
        System.out.println(resultProduct);

        boolean resultAnd  = (Boolean) privateAndMethod.invoke(operationInstance, true, true);
        assert resultAnd : "reflect invoke of and was not correct. returned result: "+ resultAnd;
        System.out.println(resultAnd);

        int resultMax  = (Integer) protectedMaxMethod.invoke(operationInstance, 22, 42);
        assert resultMax == 42 : "reflect invoke of max was not correct. returned result: "+ resultMax;
        System.out.println(resultMax);

    }
    public double publicSum(int a, double b){
        return a+b;
    }
    public static double staticProduct (float a, long b){
        return a*b;
    }

    private boolean privateAnd (boolean a, boolean b){
        return a&&b;
    }

    protected int protectedMax(int a, int b){
        return Math.max(a, b);
    }


}
