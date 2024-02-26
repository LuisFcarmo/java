import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int valor;
        int buscando;
        entrada.nextLine();
        List <Integer> array = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }

        buscando = entrada.nextInt();
        entrada.nextLine();

        Predicate <Integer> buscar = numero -> numero >= buscando;
        List <Integer> resto = 
        array.stream()
        .filter(buscar)
        .collect(Collectors.toList
        ());

        System.out.println(resto.size());
        entrada.close();
    }
}
