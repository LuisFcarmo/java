import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        entrada.nextLine();
        double b = entrada.nextDouble();
        entrada.nextLine();

        System.out.printf("O VALOR EM CELSIUS = %.2f\n", (5*(a-32))/9);
        System.out.printf("A QUANTIDADE DE CHUVA E = %.2f", b*25,4);
        entrada.close();
    }
}
