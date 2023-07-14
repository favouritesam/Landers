package unaryOperator;

import java.util.function.UnaryOperator;

public class Examples {
    public static void main(String[] args) {
        UnaryOperator<Integer> functionOne = (number)->{
            return number * 2;
        };
        Integer result = functionOne.apply(5);
        System.out.println(result);
    }
}
