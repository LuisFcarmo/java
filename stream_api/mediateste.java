import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.print.attribute.standard.Media;

public class mediateste {
    public static void main(String[] args) {
        aluno a1 = new aluno("pedro", 9.0);
        aluno a2 = new aluno("luis", 9.0);
        aluno a3 = new aluno("luisa", 9.0);
        aluno a4 = new aluno("maria", 9.0);
        aluno a5 = new aluno("jotinha", 9.0);
        List <aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        
        Predicate <aluno> aprovado = x -> x.nota >= 7;
        Function <aluno, Double> apenas_nota = x -> x.nota;
        BiFunction <media, Double, media> calcular_media = 
        (media, nota) -> media.adicionar(nota);
        BinaryOperator <media> combinarMedia = (md1, md2) -> media.combinar(md1, md2);

        //a partir de uma classe nossa conseguir usar o reduce mais arrojado combinando outros conhecimentos
        media resulta = alunos.stream()
        .filter(aprovado)
        .map(apenas_nota)
        .reduce(new media(), calcular_media, combinarMedia);
        
        System.out.println("a media do aluno é" + resulta.getValor());

    }
}
