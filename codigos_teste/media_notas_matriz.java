package codigos_teste;

import java.util.Scanner;

public class media_notas_matriz {
    public static void main(String[] args) {
        int qtd_alunos = 0;
        int qtd_notas = 0;
        double acumulador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a quantidade de alunos");
        System.out.println("informe a quantidade de notas");
        qtd_alunos = entrada.nextInt();
        qtd_notas = entrada.nextInt();
        double[][] matriz = new double[qtd_alunos][qtd_notas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("aluno %d\n", i+1);
            for (int k = 0; k < matriz[i].length; k++) {
                acumulador += matriz[i][k];
            }   
            System.out.printf("media das notas %f\n", acumulador/qtd_notas);
            acumulador = 0;
        }


    }
}
