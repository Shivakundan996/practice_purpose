package ExceptionClass;

import java.io.IOException;

public class ThrowsExample {

    void m() throws IOException{
        throw new IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        ThrowsExample throwsExample = new ThrowsExample();
        throwsExample.p();
        System.out.println("normal flow..");
    }
}
