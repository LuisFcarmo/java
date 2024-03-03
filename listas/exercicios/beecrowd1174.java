import java.util.Scanner;

public class beecrowd1174 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        for (int  i = 0; i < 100; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            if (valor <= 10) {
                System.err.printf("A[%d] = %d\n", i, valor);
            }
        }        
    
    }
}
