package predicate;

import java.util.function.Predicate;

public class Exampls {
    public static void main(String[] args) {
        Predicate<Integer> predicate= (number)->{
            boolean isNumberEven = number%2 ==0;
            return  isNumberEven;
        };
        boolean result = predicate.test(5);
        System.out.println(result);
    }
}
