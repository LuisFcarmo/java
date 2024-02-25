import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class messingnumber {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.nextLine();
        int numero = 0;
        for (int i = 0; i < qtd-1; i++) {
            numero = entrada.nextInt();
            entrada.nextLine();
            array.add(numero);
        }
        Collections.sort(array);
        for (int i = 0; i < array.size()-1; i++) {
            if (((array.get(i+1) - array.get(i)) > 1)) {
                System.out.println(array.get(i)+1);
                break;
            }
        }
        entrada.close();
    }
}
