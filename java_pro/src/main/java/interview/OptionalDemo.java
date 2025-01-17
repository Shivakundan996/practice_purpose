package interview;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        int x= 6;
        System.out.println(x + ++x + x++);

        // java.lang.NullPointerException
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));





    }



}
