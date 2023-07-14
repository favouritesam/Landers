package suppliers;

import java.util.function.Supplier;

public class Examples {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            return  "we are elites peeps";
        };
        String result = supplier .get();
        System.out.println(result);
    }
}
