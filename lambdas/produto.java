import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * produto
 */
public class produto {
    public double preco;
    public String nome;
    public double desconto;
    produto (double preco, String nome, Double desconto) {
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
    }   
    public static void main(String[] args) {
        DecimalFormat fm = new DecimalFormat("#.##");

        produto banana = new produto(12.32
        , "banana", 10.0);
        Function <produto, Double> desconto = 
        x -> (x.preco) - (x.preco*(x.desconto/100));
        
        Function <Double, Double> imposto_m  = 
        x -> x >= 2500 ? ((x) + (x*(8.5/100))): x;

        Function <Double, Double> frete  = 
        x -> x >= 3000 ? ((x) + 100): (x + 30);


        Function <Double, String> arredondar  = 
        x -> fm.format(x);

        String resultado = 
           desconto.andThen(imposto_m).andThen(frete).andThen(arredondar).apply(banana);
        System.out.println(resultado);
        
        }
}