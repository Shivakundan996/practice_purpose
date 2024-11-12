package practice;
interface keyboard {
    String display();
}

class DellKeyboard implements keyboard {
    @Override
    public String display() {
        return "dell keyboard";
    }
}

class LenovoKeyboard implements keyboard {
    @Override
    public String display() {
        return "lenovo keyboard";
    }
}

class Computer {

    @Override
    public String toString() {
        return "Computer{}";
    }

    // the method is now dependent on the interface Keyboard
    public void keyboardUsed(keyboard kb) {
        System.out.println("The computer is using " + kb.display());
    }

}


public class LooseCouplingExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.hashCode());
        LenovoKeyboard lenovoKeyboard = new LenovoKeyboard();
        DellKeyboard dellKeyboard = new DellKeyboard();
        computer.keyboardUsed(dellKeyboard);
    }
}
