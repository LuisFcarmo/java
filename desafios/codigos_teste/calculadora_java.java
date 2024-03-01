package codigos_teste;
import java.util.Scanner;
public class calculadora_java {
    public static void main(String[] args) {
        String opera = new String();
        int numero1;
        int numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite a opera que deseja realizar (+ / * -)");
        opera = entrada.nextLine();
        System.out.println("digite o primeiro numero");
        System.out.println("digite o segundo numero");
        numero1 = entrada.nextInt(); 
        numero2 = entrada.nextInt();

        if (opera.trim().equals("+")){
            System.out.printf("a soma vai ser %d", (numero1+numero2));
        }
        else if (opera.trim().equals("-")) {
            System.out.printf("a soma vai ser %d", (numero1-numero2));

        }
        else if (opera.trim().equals("/")) {
            System.out.printf("a soma vai ser %d", (numero1/numero2));

        }
        else if (opera.trim().equals("*")) {
            System.out.printf("a soma vai ser %d", (numero1*numero2));

        } 
        else if (opera.trim().equals("%")) {
            System.out.printf("a soma vai ser %d", (numero1%numero2));

        }
        entrada.close();
    }
}
