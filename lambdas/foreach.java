import java.util.Arrays;
import java.util.List;

public class foreach {
    static void meuIMPRIMIR(String nome) {
        System.out.println("nome " + nome);
    }
    public static void main(String[] args) {
        List <String> aprovados = Arrays.asList("lista", "lista2", "lista2");
        aprovados.forEach((nome) -> {System.out.println(nome);});
        /*este primeiro é o mais atulizado*/
        aprovados.forEach(nome -> meuIMPRIMIR(nome));
        //ou
    }
}
