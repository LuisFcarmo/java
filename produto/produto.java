package produto;
public class produto {
    String nome;
    double preco;
    double desconto;

    double get_preco_desconto(){
        return (preco*(1-desconto));
    };

    double get_preco_desconto(double desconto_do_gerente){
        return (preco*(1-desconto_do_gerente));
    };
    
    String get_name_produto(){
        return nome;
    };

}
