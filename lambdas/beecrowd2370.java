import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class beecrowd2370 {
    static List <jogador> array; 

    public static jogador get_mais_habilidos() {
        Collections.sort(array);
        String nome = array.get(array.size()-1).nome;
        int habilidade = array.get(array.size()-1).nivel;
        jogador maior = new jogador(nome, habilidade);
        array.remove(array.size()-1);
        return maior;
    }

    public static void main(String[] args) {
        int index = 0;
        Scanner entrada = new Scanner(System.in);

        int qtd_jogadores = entrada.nextInt();
        entrada.nextLine();
        array = new ArrayList <jogador>(qtd_jogadores);

        int qtd_time = entrada.nextInt();
        entrada.nextLine();
        
        String nome;
        int nivel;

        for (int i = 0; i < qtd_jogadores; i++) {
            nome = entrada.nextLine();
            nivel = entrada.nextInt();
            entrada.nextLine();
            array.add(new jogador(nome, nivel));
        }

        List <List <jogador>> matrizTimes = new ArrayList<>();
        
        for (int i = 0; i < qtd_time; i++) {
            matrizTimes.add(new ArrayList<>());
        }

        while (array.size() > 0) {
            index++;
            System.err.println(index);
            //verificando se ele saiu o index
            if (index >= qtd_time) index = 0;
            matrizTimes.get(index).add(get_mais_habilidos());
        }

    
        for (int i = 0; i < matrizTimes.size(); i++) {
            System.out.println("time " + i);
            List<jogador> time = matrizTimes.get(i);
            for (jogador x: time) {
                System.out.println("Nome: " + x.nome + ", Nível: " + x.nivel);
            }
        }
        entrada.close();
    }

}