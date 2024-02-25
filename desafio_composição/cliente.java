/**
 * cliente
 */
import java.util.*;

public class cliente {
    String name;
    LinkedList <compra> carrinho = new LinkedList <> ();    
    int cpf;

    public cliente(String name, int cpf) {
        this.name = new String(name);
        this.cpf = cpf;
    }       
    public String get_name(){
        return this.name;
    }
    public void comprar(compra x) {
        carrinho.push(x);
    }

    double total() {
        double soma = 0;
        for (int i = 0; i < carrinho.size(); i++) {
            for (int k = 0; k < carrinho.get(i).carrinho_itens.size(); k++) {
                soma += (carrinho.get(i).carrinho_itens.get(k).tipo.preco)*(carrinho.get(i).carrinho_itens.get(k).qtd);
            }
        }
        return soma;
    }
}