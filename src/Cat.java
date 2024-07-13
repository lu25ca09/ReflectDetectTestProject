

public class Cat {
    private final String name;
    private int age;
    public Cat(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    @Override
    public String toString() {
        return "Cat's name: " + name + "\n" + name + " age: " + age;
    }



    public String getName(){return name;}
    public int getAge(){return age;}
    public void setAge(int pAge){age=pAge;}


}
