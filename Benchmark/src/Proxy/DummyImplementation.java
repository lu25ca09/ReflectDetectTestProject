package Proxy;

interface DummyInterface {
    public void hello();
    public void bye();
}


public class DummyImplementation implements DummyInterface{
    public DummyImplementation(){

    }

    @Override
    public void hello() {
        System.out.println("Hello Interface");
    }

    @Override
    public void bye() {
        System.out.println("Goodbye Interface");
    }
}
