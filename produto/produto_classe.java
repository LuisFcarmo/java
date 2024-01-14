package produto;
public class produto_classe {
    String nome;
    double preco;
    double desconto;
    
    produto_classe (){};
    
    produto_classe (String nome_e, double preco_e, double desconto_e) {
        nome = nome_e;
        preco = preco_e;
        desconto = desconto_e;
    }

    double get_preco_desconto(){
        return (preco*(1-desconto));
    }

    double get_preco_desconto(double desconto_do_gerente){
        return (preco*(1-desconto_do_gerente));
    }
    
    String get_name_produto(){
        return nome;
    }

    void print_produto () {
        System.out.printf("\nnome do produto %s\n preço do produto %f\n desconto padrao %f porcento", nome, preco, desconto*100);
    }
} 
