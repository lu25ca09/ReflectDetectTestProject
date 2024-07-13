package LoadClass;

public class LoadClassFeatures {
    public LoadClassFeatures() throws ClassNotFoundException {
        System.out.println("\n-----------------------\nLoadClassFeatures: ");
        Class<?> temp1 = Class.forName("LoadClass.DummyClass");
        Class<?> temp2 = Class.forName("LoadClass.DummyClass",true,this.getClass().getClassLoader());
        Class<?> temp3 = this.getClass().getClassLoader().loadClass("LoadClass.DummyClass");
        System.out.println("Class loaded to temp1: "+temp1.getName());
        System.out.println("Class loaded to temp2: "+temp2.getName());
        System.out.println("Class loaded to temp3: "+temp3.getName());
    }
}
