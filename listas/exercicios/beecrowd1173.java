import java.util.Scanner;

public class beecrowd1173 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inteiro = entrada.nextInt();
        int [] array = new int[10];

        entrada.nextLine();

        for (int i = 0; i < 10; i++) {
            array[i] = inteiro;
            inteiro*=2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("N100[%d] = %d\n", i, array[i]);
        }

    }
}
