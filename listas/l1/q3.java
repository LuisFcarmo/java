import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double altura = entrada.nextDouble();
        double volume = (2*(Math.PI*Math.pow(raio, 2))) + (2*Math.PI*raio*altura);
        System.out.printf("O VALOR DO CUSTO E = %.2f", volume*100);
        entrada.close();
    }
}
