import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int valor = 0;
        entrada.nextLine();
       
        while(qtd-- >= 0) {
            valor = entrada.nextInt();
            entrada.nextLine();
            System.out.println(Integer.toBinaryString(valor));
        }
    }
}
