package produto;
public class produto_teste {
    public static void main(String[] args) {
        produto_classe p1 = new produto_classe();
        p1.print_produto();
        
        produto_classe p2 = new produto_classe("jaca", 10, 0.6);
        p2.print_produto();
    }
}
