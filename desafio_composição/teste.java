public class teste {
    public static void main(String[] args) {
        //teste das composições
        cliente x = new cliente("luis", 121212);
        compra carrinho = new compra();
        compra carrinho2 = new compra();

        produto_novo banana = new produto_novo("banana", 1);
        item item_x = new item(2, banana);
        produto_novo banana2 = new produto_novo("aa", 1
        );
        item item_x2 = new item(2, banana2);
        
        for (int i = 0; i < 10; i++){
            carrinho.comprar(item_x);
        }
        x.comprar(carrinho);
  
        for (int i = 0; i < 10; i++){
            carrinho2.comprar(item_x2);
        }
        x.comprar(carrinho2);

        System.err.println(x.total());

    }
}
