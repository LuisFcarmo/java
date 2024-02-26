import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class filter {
    /* 
     * FILTER (CONDIÇÂO PRA PASSAR NO FILTRO)
     * exemplo FILTER (n -> n % 2 == 0) se o n for par
    */
    public static void main(String[] args) {
        aluno a1 = new aluno("pedro", 9.0);
        aluno a2 = new aluno("luis", 5.0);
        aluno a3 = new aluno("luisa", 4.0);
        aluno a4 = new aluno("maria", 6.0);
        aluno a5 = new aluno("jotinha", 7.0);
        List <aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate <aluno> aprovado = a -> a.nota >= 7;
        Function <aluno, String> parabens = (aluno) -> ("parabéns" + aluno.nome + " ");
        

        alunos.stream()
        .filter(aprovado)
        .map(parabens)
        .forEach(System.out::println);
    }
}