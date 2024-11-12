package practice;

import static org.apache.commons.lang3.ArrayUtils.indexOf;

public class Main {
    int a = 10;
    static int b = 100;
    public static void main(String[] args) {
        String s = "C:ZAdvantagePentaho_TicketsVACONADVPENTCOV-2291Filesoutput/apebdoc.xml";
        String output1 = s.substring(0, s.indexOf("output") + 7);
        int output = s.indexOf("output");
        System.out.println("penthao"+output1);


        display();
        new Main().show();  //anonymous class(new Main())
    }
    public static void display() {
        System.out.println(new Main().a);
        System.out.println(Main.b);
    }
    public void show() {
        System.out.println(new Main().a);
        System.out.println(Main.b);
    }
}