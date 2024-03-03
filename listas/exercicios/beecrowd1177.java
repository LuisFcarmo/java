import java.util.Scanner;

public class beecrowd1177 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolhido = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("N[%d] = %d\n", i, i%escolhido);
        }
    }
}
