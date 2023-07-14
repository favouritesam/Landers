package collections;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<String> words = List.of(
                "java","python",
                "C++","Go",
                "Rust","java",
                "python","C++"

        );

        Set<String> languages=words.stream()   //["java","python","c++","Go","Rust","java","python",""C++"]
                .filter((word)->word.length()>2)   //["java","python","c++","Go","Rust","java","python",""C++"]
                .collect((Collectors.toSet()) );

        System.out.println(languages);  //["java","python","c++","Go","Rust"]
    }
}
