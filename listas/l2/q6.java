import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class q6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int valor;
        entrada.nextLine();
        List <Integer> array = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }
        
        
        BinaryOperator <Integer> somatorio = (a, b) -> a + b;
        
        int soma = array.stream().reduce(somatorio).get();
        System.out.println(soma);
        entrada.close();
    }
}
