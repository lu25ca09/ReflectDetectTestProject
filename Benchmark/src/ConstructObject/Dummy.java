package ConstructObject;

public class Dummy {
    private final String text;
    public Dummy(){
        text="Constructed without parameters";
    }
    private Dummy(String aText){
        text="Constructed with String parameter aText containing: " + aText;
    }


    public void print(){
        System.out.println(text);
    }
}
