package consumer;

import java.util.function.Consumer;

public class Examples {
    public static void main(String[] args) {
        Consumer<String> consumer = (name)->{
            System.out.println("you passed " +name+ " to the consumer parameter");
        };
        consumer.accept("favour");
    }
}
