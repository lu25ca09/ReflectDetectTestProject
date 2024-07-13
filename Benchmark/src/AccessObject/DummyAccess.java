package AccessObject;

public class DummyAccess {
    private final String sPrivate = "private field";
    public final String sPublic = "public field";
    protected final String sProtected = "protected field";
    final String sAbstract = "abstract field";
    private final String text;
    public DummyAccess(String pText){
        text = pText;
    }
    public void foo(){
        final int a = 42;
    }
}
