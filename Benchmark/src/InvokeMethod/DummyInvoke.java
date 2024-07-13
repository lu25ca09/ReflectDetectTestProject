package InvokeMethod;

public class DummyInvoke {
    public static String printPublicStatic(){return"Hello public Static Invoke";}
    private static String printPrivateStatic(){return "Hello private Static Invoke";}
    private String getPrivateString(){return "Hello private Invoke";}
    public String getPublicString(){return "Hello public Invoke";}
}
