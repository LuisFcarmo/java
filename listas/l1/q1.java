import java.util.Scanner;

class q1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salario = entrada.nextDouble();
        entrada.nextLine();
        Double qkw = entrada.nextDouble();
        entrada.nextLine();
        Double valorkw = (salario * 0.7)/100;

        System.out.printf("Custo por kw: R$ %.2f\nCusto por consumo: %.2f\nCusto com desconto: R$ %.2f\n", valorkw, qkw*valorkw, ((qkw*valorkw)-(qkw*valorkw)*0.1));
        entrada.close();
     }
}