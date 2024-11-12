package classCasting;

class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void food(){
        System.out.println("animal is hungry");
    }
}

class Dog1 extends Animal1 {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

class Cat extends Animal1 {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal1 animal = new Cat(); // Upcasting, Cat is treated as Animal
        animal.food();

        // Attempting to cast a Cat object to a Dog reference (incompatible types)
        try {
            Dog1 dog = (Dog1) animal;    // This line throws ClassCastException
            dog.fetch();               // This line won't be executed
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }


}




