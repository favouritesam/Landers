package function;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<String,Integer> function = (word)->{
            return word.length();
        };
        Integer result = function .apply("maleek");
        System.out.println(result);
    }
}
