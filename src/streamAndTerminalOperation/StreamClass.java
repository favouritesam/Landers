package streamAndTerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamClass {
    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(100);
        numbers.add(300);
        numbers.add(400);


        Stream<Integer> initialStream = numbers.stream();
        System.out.println("original stream:"+initialStream);
                Stream<Integer> streamAfterFilter = initialStream.filter((number)->number %2 != 0);
                streamAfterFilter.forEach((number)-> System.out.println(number));

    }

}
