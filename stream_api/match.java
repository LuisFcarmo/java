import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class match {
    public static void main(String[] args) {
        aluno a1 = new aluno("pedro", 9.0);
        aluno a2 = new aluno("luis", 5.0);
        aluno a3 = new aluno("luisa", 4.0);
        aluno a4 = new aluno("maria", 6.0);
        aluno a5 = new aluno("jotinha", 7.0);
        List <aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate <aluno> aprovado = a -> a.nota >= 7;
        // allMatch todos os dados do stream passaram no predicado
        // anyMatch algum dos dados passaram no stream 
        // noneMatch nenhum dos dados passaram no stream
        // negate() == ! nega os valores verdades
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate()));
        
        //este comparator implementa a logica que vai ser usada para definir a ordem no stream
        Comparator <aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };
        //mim e max

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

    }
}
