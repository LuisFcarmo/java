import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Increasingarray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.nextLine();
        int valor = 0;
        int total = 0;
        List <Integer> array = new ArrayList<>(); 
        
        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }
        for (int i = 0; i < qtd-1; i++) {
            if (array.get(i) > array.get(i+1)) {
                total += (array.get(i)-  array.get(i+1));
            }
        }
        System.out.println(total);
        entrada.close();
    }
}