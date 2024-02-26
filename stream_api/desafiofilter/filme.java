package desafiofilter;

import java.util.ArrayList;
import java.util.List;

public class filme {
    final public String nome;
    final public boolean ganhou;
    final public Integer ano;
    final public String categoria;

    filme (String nome, boolean ganhou, Integer ano, String categoria) {
        this.nome = nome;
        this.ganhou = ganhou;
        this.ano = ano;
        this.categoria = categoria;
    }
    static List <filme> cadastrar() {
        filme vencedor1 = new filme("Parasita", true, 2020, "Melhor Filme");
        filme vencedor2 = new filme("Joaquin Phoenix", true, 2020, "Melhor Ator");
        filme vencedor3 = new filme("Renée Zellweger", true, 2020, "Melhor Atriz");
        
        filme vencedor4 = new filme("Green Book: O Guia", true, 2019, "Melhor Filme");
        filme vencedor5 = new filme("Alfonso Cuarón", true, 2019, "Melhor Diretor");
        filme vencedor6 = new filme("Rami Malek", true, 2019, "Melhor Ator");
        filme vencedor22 = new filme("12 Anos de Escravidão", true, 2014, "Melhor Filme");
        filme vencedor23 = new filme("Alfonso Cuarón", true, 2014, "Melhor Diretor");
        filme vencedor24 = new filme("Matthew McConaughey", true, 2014, "Melhor Ator");

        filme vencedor7 = new filme("Birdman ou (A Inesperada Virtude da Ignorância)", true, 2015, "Melhor Filme");
        filme vencedor8 = new filme("Alejandro González Iñárritu", true, 2015, "Melhor Diretor");
        filme vencedor9 = new filme("Julianne Moore", true, 2015, "Melhor Atriz");
        filme vencedor10 = new filme("Argo", true, 2013, "Melhor Filme");
        filme vencedor11 = new filme("Ang Lee", true, 2013, "Melhor Diretor");
        filme vencedor12 = new filme("Daniel Day-Lewis", true, 2013, "Melhor Ator");

        filme vencedor13 = new filme("O Artista", true, 2012, "Melhor Filme");
        filme vencedor14 = new filme("Michel Hazanavicius", true, 2012, "Melhor Diretor");
        filme vencedor15 = new filme("Jean Dujardin", true, 2012, "Melhor Ator");

        
        
        filme indicado1 = new filme("O Irlandês", false, 2020, "Melhor Filme");
        filme indicado2 = new filme("Adam Driver", false, 2020, "Melhor Ator");
        filme indicado3 = new filme("Scarlett Johansson", false, 2020, "Melhor Atriz");
        
        filme indicado4 = new filme("Nasce uma Estrela", false, 2019, "Melhor Filme");
        filme indicado5 = new filme("Yorgos Lanthimos", false, 2019, "Melhor Diretor");
        filme indicado6 = new filme("Christian Bale", false, 2019, "Melhor Ator");
        
        filme indicado7 = new filme("Gravidade", false, 2014, "Melhor Filme");
        filme indicado8 = new filme("Martin Scorsese", false, 2014, "Melhor Diretor");
        filme indicado9 = new filme("Leonardo DiCaprio", false, 2014, "Melhor Ator");
        
        List <filme> array = new ArrayList<>();
        array.add(vencedor1);
        array.add(vencedor2);
        array.add(vencedor3);
        array.add(vencedor4);
        array.add(vencedor5);
        array.add(vencedor6);
        array.add(vencedor7);
        array.add(vencedor8);
        array.add(vencedor9);
        array.add(vencedor10);
        array.add(vencedor11);
        array.add(vencedor12);
        array.add(vencedor13);
        array.add(vencedor14);
        array.add(vencedor15);
        array.add(vencedor22);
        array.add(vencedor23);
        array.add(vencedor24);
        array.add(indicado1);
        array.add(indicado2);
        array.add(indicado3);
        array.add(indicado4);
        array.add(indicado5);
        array.add(indicado6);
        array.add(indicado7);
        array.add(indicado8);
        array.add(indicado9);
        return array;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Ganhou: " + (ganhou ? "Sim" : "Não") + "\n" +
                "Ano: " + ano + "\n" +
                "Categoria: " + categoria + "\n--------------------------";
    }

}