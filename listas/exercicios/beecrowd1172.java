import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beecrowd1172 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int[10];
        int valor;
        for (int i = 0; i < 10; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            if (valor > 0) {
                array[i] =  valor;
            } else {
                array[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d", i, array[i]);
        }
    }
}
