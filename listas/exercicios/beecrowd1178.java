import java.util.Scanner;

public class beecrowd1178 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < 100; i++) {
            System.out.printf("X[%d] = %.2f\n", i, numero);
            numero /= 2;
        }
    }
}
