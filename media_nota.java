import java.util.Scanner;

public class media_nota {
    public static void main(String[] args) {
        byte op = 0;
        double total = 0;
        byte qtd = 0;
        byte nota = 0;
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            System.out.println("digite -1 para sair");
            op = entrada.nextByte();
            if (op == -1) break;
            while (true) {
                nota = entrada.nextByte();
                if (nota < 0 || nota > 10) {
                    System.out.println("nota invalida informe outra");
                } else {
                    break;
                }
            }
            qtd++;
            total += nota;
        }
        if (qtd > 0) {
            System.out.printf("Total de alunos = %d media da sala = %.2f", qtd, (total/qtd)); 
        } else {
            System.out.println("nenhuma notainformada");
        }
        entrada.close();
    }
}
