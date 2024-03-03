import java.util.Scanner;

public class beecrowd1175 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = entrada.nextInt();
            entrada.nextLine();
        }
        for (int i = 0, k = 19; i < 10 && k > 9; i++, k--) {
            int aux = array[k];
            array[k] = array[i];
            array[i] = aux;
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
    }
}
