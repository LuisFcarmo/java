import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * DistinticNumber
 */
public class DistinticNumber {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.nextLine();
        int valor = 0;
        int contador = 0;
        int total = 0;

        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }
        
        Collections.sort(array);
        
        for (int i = 0; i < qtd-1; i++) {
            contador++;
            if (contador == 1) {
                total++;
            }
            if (array.get(i) != array.get(1+i)) {
                contador = 0;
            }
        }

        System.out.println(total);
    }
}