package ExceptionClass;

import java.io.*;
class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}

class N extends M{
    @Override
    void method() throws IOException {
        System.out.println("exception occured");
    }
}
class Testthrows4{
    public static void main(String args[])throws IOException{//declare exception
        M m=new N();
        m.method();

        System.out.println("normal flow...");
    }
}
