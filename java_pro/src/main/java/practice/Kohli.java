package practice;
class Virat{

    static Integer centuries(int centuries){
        if(centuries<50){
            System.out.println("he is not virat kohli");
            return new Integer("below 50");
        }
        return null;
    }
}
public class Kohli {
    public static void main(String[] args) {
        Integer centuries = Virat.centuries(48);
        System.out.println(centuries.toString());
    }


}
