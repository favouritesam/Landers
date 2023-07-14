package intermediateOperations;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,2,3,4,5),
                List.of(10,20,30,40,50),
                List.of(100,200,300,400,500)
        );
        list.stream()  //[1,2,3,4,5],[10,20,30,40,50],[100,200,300,400,500] ==>[1,2,3,4,5,10,20,30,40,50,100,200,300,400,500]
                .flatMap((element)->element.stream())
                .forEach(System.out::println);



        list.stream()      //[1,2,3,4,5],[10,20,30,40,50],[100,200,300,400,500]
                .flatMapToInt((element)-> element.stream()
                        .mapToInt((number)->number))
                .sum();

    }
}
