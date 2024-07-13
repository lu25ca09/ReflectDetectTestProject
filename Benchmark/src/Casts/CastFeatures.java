package Casts;

public class CastFeatures {
    public CastFeatures(){
        System.out.println("\n-----------------------\nCastsFeatures: ");
        Animal animal = new Dog();
        animal.makeSound(); // Calls Dog's makeSound() method

        Dog.class.cast(animal).fetch();
        ((Dog)animal).fetch();




    }
}
