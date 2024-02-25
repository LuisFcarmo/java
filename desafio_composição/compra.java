import java.util.LinkedList;

/**
 * compra
 */
public class compra {
    LinkedList <item> carrinho_itens = new LinkedList <item> ();
    public compra(){};
    void comprar (item x) {
        carrinho_itens.push(x);
    }
}