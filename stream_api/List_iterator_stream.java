import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


class list_iterator_stream {
    public static void main(String[] args) {
        List <String> aprovados = Arrays.asList("lu", "gui", "lucas");
        //for each
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        //caminho pela lista usando iterator basicamento um ponteiro que aponta pro começo da lista e ele vai indo até acabar a lista
        Iterator <String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //outra maneira de exibir uma lista na tela
        Stream <String> stream = aprovados.stream();
        stream.forEach(System.out::println);

        //formas de stream

        Consumer <Object> print  = System.out::print;

        //primeira forma de criar
        Stream <String> langs = Stream.of("java ", " lua", " js", " python\n");

        langs.forEach(print);
        //segimda fprma
        String[] miaslangs = {"ruby", " Shell", " Lisp", " go\n"};

        //terceira forma
        Stream.of(miaslangs).forEach(print);
    
        //quarta forma
        Arrays.stream(miaslangs).forEach(print);

        //formas de printar aqui ele vai do primeiro item ate o n-1
        Arrays.stream(miaslangs, 1, 2).forEach(print);

        //forma com colections
        aprovados.stream().forEach(print);
        //stream paralelo
        aprovados.parallelStream().forEach(print);

        //generate é um stream possivelmente infinita
        //a generate recebe uma lambda do type consumer
        //Stream.generate(() -> "a").forEach(print);
        //também é infinito e gera valores indefidamente
        //Stream.iterate(0, n -> n = 1).forEach(print);;
    }
}