package stream;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        numbers.stream() //[10,20,30,40,50]
                .filter((number)->number >=50) //[50]
                .forEach((number)-> System.out.println(number)); // => 50
    }
}
