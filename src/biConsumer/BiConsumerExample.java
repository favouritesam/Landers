package biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer,String> bioConsumer =(age, name)->{
            System.out.println(name+ "is"+age+"years old");
        };
        bioConsumer.accept(25,"joy");
    }
}
