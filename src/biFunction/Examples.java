package biFunction;

import java.util.function.BiFunction;

public class Examples {
    public static void main(String[] args) {
        BiFunction<String ,String, Integer> biFunction = (firstWord, secondWord) ->{
            int lengthOfFirstWord = firstWord.length();
            int lengthOfSecondWord = secondWord.length();
            int sum = lengthOfSecondWord + lengthOfFirstWord;
            return  sum;
        };
        int result = biFunction.apply("word","hello");
        System.out.println(result);
    }
}
