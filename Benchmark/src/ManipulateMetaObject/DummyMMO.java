package ManipulateMetaObject;

public class DummyMMO {
    private String field = "private Field of dummyMMO was accessed";
    private DummyMMO(){System.out.println("private Constructor for dummyMMO was called");}
    private void print(){System.out.println("private Method print() in dummyMMO was called");}
}
