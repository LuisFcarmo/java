import java.util.List;
import java.util.Scanner;

public class beecrowd1179 {
    public static void main(String[] args) {
        int position = 0;
        int menor = 0;
        int valor = 0;
        int qtd;
        Scanner entrada = new Scanner(System.in);
        qtd = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            if (i == 0) {
                menor = valor;
            }
            else {
                if (menor > valor) {
                    position = i;
                    menor = valor;
                }
            }
        }
        System.out.printf("Menor valor: %d\nPosicao: %d ", menor, position);
    }
}
