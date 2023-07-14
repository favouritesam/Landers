package intermediateOperations;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> words = List.of("House","Rain","Weather","Bridge","Road");

//        //map represents a transformation operation
//        int result = words.stream()        //["House","Rain","Weather","Bridge","Road]
//                .map((word)->word.length())               //[5,4,7,6,4]
////                .forEach((element)-> System.out.println(element));
//                .reduce( 0,(firstNumber,secondNumber)->firstNumber + secondNumber);
//        System.out.println(result);



        //mapToInt()
//        int result = words.stream()   //["House","Rain","Weather","Bridge","Road]
//                .mapToInt((word)->word.length()) //[5,4,7,6,4]
//                .sum();
//        System.out.println(result);



        //mapToDouble()
                Double result = words.stream()   //["House","Rain","Weather","Bridge","Road]
                        .mapToInt((word)->word.length()) //[5,4,7,6,4]
                        .mapToObj((element)->element) // Stream
                        .mapToDouble((element)->2.0 * element)
                        .sum();
        System.out.println(result);



    }

}

