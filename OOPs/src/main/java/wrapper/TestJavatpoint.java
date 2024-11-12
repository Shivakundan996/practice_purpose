package wrapper;

class Javatpoint{
    private int i;
    Javatpoint(){}
    Javatpoint(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }

    //if toString method is not there ,thn j will print its address
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
//Testing the custom wrapper class
public class TestJavatpoint{
    public static void main(String[] args){
        Javatpoint j=new Javatpoint(10);
        //because of toString method j prints value orelse it will print address
        System.out.println(j);
    }}
