import java.util.LinkedList;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int valor;
        entrada.nextLine();

        LinkedList <Integer> array = new LinkedList<>();
        for (int i = 0; i < qtd; i++) {
            valor = entrada.nextInt();
            entrada.nextLine();
            array.add(valor);
        }
        
        for (int i = array.size()-1; i >= 0; i--) {
            System.out.println(" " + array.get(i));
        }

        entrada.close();
    }
}   
