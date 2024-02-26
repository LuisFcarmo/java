import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class map {
    public static void main(String[] args) {
        /* 
         * MAP (LAMBDA EXPRESSION QUE DIZ COMO O ARRAY SERA MAPEADO)
         * 
        */
        Consumer <String> print = System.out::println;
        List <String> marcas = Arrays.asList("Bmw", "audi", "honda");
        
        marcas.stream().map((m -> m.toUpperCase())).forEach(print);;
        //fazendo composições
        UnaryOperator <String> maiuscula = n -> n.toUpperCase();
        UnaryOperator <String> primeiraletra = n -> n.charAt(0) + "";
        UnaryOperator <String> grito = n -> n + "!!!";
        //esses metodos também podem ser jogados para outros locais para serem utilizadas
        //mapeando usando varias functions
    
        marcas.stream()
        .map(maiuscula)
        .map(primeiraletra)
        .map(grito)
        .forEach(print);
    }
}
