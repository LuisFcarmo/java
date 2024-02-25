package objetos;
import java.awt.*;
import javax.swing.JPanel;


public class draw extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharQuadrado(g);
    }

    private void desenharQuadrado(Graphics g) {
        int tamanhoLado = 50; // Tamanho do lado do quadrado
        int x = 50; // Coordenada x do canto superior esquerdo do quadrado
        int y = 50; // Coordenada y do canto superior esquerdo do quadrado
        g.setColor(Color.pink);
        g.drawRect(x, y, tamanhoLado, tamanhoLado);
    }
}
