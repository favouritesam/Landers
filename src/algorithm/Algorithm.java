package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Algorithm {
    public static  long countSpecialCharactersIn(String[] strings){
        String specialCharacters = "!@#$%^&*()_-+=[]{}`/<',>\"'";
        long numberOfSpecialCharacters = Arrays.stream(strings)  //[911@abc123_","wc4%@123-"AHc@123+","6543ttd<#"]
                .flatMap((element)-> Stream.of(element.split("")))
                .filter((element)->specialCharacters.contains(element))
                .count();

        
       return  numberOfSpecialCharacters;
    }
}
