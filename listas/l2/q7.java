import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class q7 {
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

        Comparator <Integer> maior = (numero1, numero2) -> {
            if (numero1 > numero2) return 1;
            if (numero1 < numero2) return -1;
            return 0;
        };
    
        int max = array.stream().max(maior).get();

    }
}
