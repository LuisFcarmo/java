package desafiofilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class app {
    public static void main(String[] args) {
        List <filme> array = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String categoria;
        Integer ano;

        array = filme.cadastrar();    
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Nome: " + array.get(i).nome);
            System.out.println("Ganhou: " + (array.get(i).ganhou ? "Sim" : "Não"));
            System.out.println("Ano: " + array.get(i).ano);
            System.out.println("Categoria: " + array.get(i).categoria);
            System.out.println("--------------------------");
        }
        System.out.println("Informe o ano\n categoria
        
        \n irei filtrar os dados pra vc\n faça um chute de qual vc acha que ganhou");
        ano = entrada.nextInt();
        entrada.nextLine();
        categoria = entrada.nextLine();
        
        

        Predicate <filme> FiltroAno = filme -> filme.ano.equals(ano); 
        Predicate <filme> FiltroCategoria = filme -> filme.categoria.toLowerCase().equals(categoria.toLowerCase()); 
       
    
        array.stream()
            .filter(FiltroAno)
            .filter(FiltroCategoria)
            .forEach(System.out::println);
    
        entrada.close();
    }
}
