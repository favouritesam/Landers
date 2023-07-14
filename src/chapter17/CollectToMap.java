package chapter17;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<String> words = List.of(
                "java","python",
                "C++","Go",
                "Rust","java",
                "python","C++"

        );

        Function<String,String> KeyMapper = (word) -> word;
        Function<String,Integer> valueMapper = (word) -> word.length();
        BinaryOperator<Integer> mergeFunction = (word,duplicate)->word+duplicate;


        Map<String,Integer> languages=words.stream()   //["java","python","c++","Go","Rust","java","python",""C++"]
                .filter((word)->word.length()>2)   //["java","python","c++","Go","Rust","java","python",""C++"]
                .collect(Collectors.toMap(KeyMapper, valueMapper, mergeFunction ,()-> new TreeMap<>()));

        System.out.println(languages);  //["java":8,"python": 12,"c++":6,"Go4":,"Rust":4]
    }
}

