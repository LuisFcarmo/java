import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class reduce {
    public static void main(String[] args) {
            aluno a1 = new aluno("pedro", 9.0);
            aluno a2 = new aluno("luis", 5.0);
            aluno a3 = new aluno("luisa", 4.0);
            aluno a4 = new aluno("maria", 6.0);
            aluno a5 = new aluno("jotinha", 7.0);
            List <aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        
            Predicate <aluno> aprovado = x -> x.nota >= 7;
            Function <aluno, Double> apenas_nota = x -> x.nota;
            BinaryOperator <Double> somatorio = (a, b) -> a +b;

            //usando reduce encadeadoa
            
            alunos.stream()
            .filter(aprovado)
            .map(apenas_nota)
            .reduce(somatorio)
            .ifPresent(System.out::println);
            
            //reduce quarta maneira
        }
    }
