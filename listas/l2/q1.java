import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class q1 {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int valor;
        int qtd;
        qtd = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }

        qtd = entrada.nextInt();
        
        for (int i = 0; i < qtd; i++) {
            int procurando = entrada.nextInt();
            entrada.nextLine();
            Predicate <Integer> verify = x -> x == procurando;
            if (array.stream().anyMatch(verify)) {
                System.out.println("achei");
            } else {
                System.out.println("não achei");
            }
        }

        entrada.close();
    }
}