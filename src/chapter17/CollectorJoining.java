package chapter17;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorJoining {
    public static void main(String[] args) {
        List<String> words = List.of(
                "java","python",
                "C++","Go",
                "Rust","java",
                "python","C++"

        );
        String result = words.stream()   // ["java","python","C++","Go","Rust","java","python","C++"]
                .filter((word)->word.length()>2)  // ["java","python","C++","Go","Rust","java","python",c++]
                .collect((Collectors.joining(" ,","[","]")));
        System.out.println(result);
    }
}
