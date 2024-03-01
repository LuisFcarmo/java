import java.util.Scanner;
import java.util.function.UnaryOperator;

public class wirdalgorithm {
    public static void main(String[] args) {
        UnaryOperator <Integer> even = (numero) -> numero /2;
        UnaryOperator <Integer> odd = (numero) -> ( numero * 3 ) + 1;
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.printf("%d ", numero);
        while (true) {
            if (numero == 1) break;
            else if (numero % 2 == 0) {
                numero = even.apply(numero);
            } else {
                numero = odd.apply(numero);
            }
            System.out.printf("%d ", numero);
        }
        entrada.close();
    }
}
