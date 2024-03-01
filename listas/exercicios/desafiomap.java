import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafiomap {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4, 6, 10, 12, 14, 6, 7, 8);
        Consumer <Integer> t = System.out::println;
        /*
         * 1 numero para string binaria 
         * 2 inverter a string
         * 3 converter de volta para inteiro
        */
        Function <Integer, String> tobinaray = (num) -> Integer.toBinaryString(num);
        UnaryOperator <String> reverse = (num) -> {
            StringBuilder builder = new StringBuilder(num).reverse();
            return builder.toString();
        };
        Function <String, Integer> toint = (num) -> Integer.parseInt(num, 2);


        nums.stream()
            .map(Integer::toBinaryString)
            .map(reverse)
            .map(toint)
            .forEach(t); 
    }
}