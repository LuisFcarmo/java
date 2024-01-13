package produto;
public class produto_teste {
    public static void main(String[] args) {
        produto p1 = new produto();
        System.out.println(p1.get_preco_desconto(0.8));
        System.out.println(p1.get_preco_desconto());
    }
}
