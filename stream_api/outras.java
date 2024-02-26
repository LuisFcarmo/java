import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class outras {
    public static void main(String[] args) {
        aluno a1 = new aluno("pedro", 9.0);
        aluno a2 = new aluno("luis", 5.0);
        aluno a3 = new aluno("luisa", 4.0);
        aluno a4 = new aluno("maria", 6.0);
        aluno a5 = new aluno("jotinha", 7.0);
        List <aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        //distinct aqui ele retorna um stream apenas com os elementos unicos do array
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\n");
        //skip ele pula um terminar n elemtos
        //limit determina a quantida x de elementos que ira ser pegada
        //Skip / limit 
        alunos.stream()
        .skip(2)
        .limit(2)
        .forEach(System.out::println);

        //takeWhile (condição) ele vai pegando enquanto a condição for satisfeita
        alunos.stream()
        .takeWhile(a -> a.nota > 7)
        .forEach(System.out::println);
    }
}
