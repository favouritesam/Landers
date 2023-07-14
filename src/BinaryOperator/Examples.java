package BinaryOperator;

import java.util.function.BinaryOperator;

public class Examples {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name,nickName)->{
            return  "your name is "+name+" and your nickname is:"+nickName;
        };
        String result = binaryOperator.apply("maleek","the big head in cohort15");
        System.out.println(result);
    }
}
