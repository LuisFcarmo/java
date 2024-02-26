import javax.print.attribute.standard.Media;

public class media {
    private double total;
    private int quantidade;

    public media adicionar (double valor) {
        total += valor;
        quantidade++;
        return this;
    }
    
    public static media combinar (media m1, media m2) {
        media resultante = new media();
        resultante.quantidade = m1.quantidade + m2.quantidade;
        resultante.total = m1.total + m2.total;
        return resultante;
    }

    public double getValor() {
        return total/quantidade;
    }
}
