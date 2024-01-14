package codigos_teste;

import java.util.Scanner;

public class calculadora_media {
        public static void main(String[] args) {
            int qtd;
            double acumulador = 0;
            Scanner entrada = new Scanner(System.in);
            System.out.println("digite a quantidade de notas");
            qtd = entrada.nextInt();    

            double[] vetor_notas = new double[qtd];
            for (int i = 0; i < vetor_notas.length; i++) {
                vetor_notas[i] = entrada.nextInt();
            }
            for(Double notas: vetor_notas) {
                acumulador += notas;
            }   
            System.out.printf("media de notas %f", acumulador/vetor_notas.length);


            entrada.close();
        }
}
