package classCasting;


class Animal{
    void sound(){
        System.out.println("animal sounds");
    }
    void food(){
        System.out.println("animal sleeps");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("dog sounds");
    }

    void fetch(){
        System.out.println("dog fetch");
    }
}

public class ClassCast1 {
    public static void main(String[] args) {

        //if we take Animal reference and instantiate to Dog1 class then only override methods can be called
        // and methods in Child cass which are not overridden can't be called, tht time class should be casted.

        Animal a = new Dog();  //assigning dog object to animal type
        //Animal a = new Animal();
        a.food();
        a.sound(); // sound() is overridden so it will get called

        /**
         * here not able to acces fetch method beacuse it is not overridden method and "a" object cannot access fetch method
         * so to acces non-overriden methods ,we need to cast a reference to Dog calss
         */
        Dog d = (Dog) a;

        d.fetch();

    }
}
