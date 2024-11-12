package practice;


class Vehicle{
    void go(){

    }
}

class Neon extends Vehicle{


}

class Cavalier extends Vehicle{
   void isConvertible(){

    }

}


public class ClassCastingforVehicles {

    public static void main(String[] args) {
        //if we take vehicle reference and instantiate to cavalier class then only override methods can be called
        // and methods in Child cass which are not overridden can't be called, tht time class should be casted.

        Vehicle v = new Cavalier();
        Cavalier c = (Cavalier)v;

//        Cavalier c = new Cavalier();
        c.go();
        c.isConvertible();
    }

}
