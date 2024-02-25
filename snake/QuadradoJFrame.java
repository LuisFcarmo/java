import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

class QuadradoPanel extends JPanel {
    int x;
    int y;

    QuadradoPanel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharQuadrado(g);
    }

    private void desenharQuadrado(Graphics g) {
        int tamanhoLado = 25; // Tamanho do lado do quadrado
        g.setColor(Color.pink);
        g.drawRect(x * 25, y * 25, tamanhoLado, tamanhoLado);
    }
}

public class QuadradoJFrame extends JFrame {

    public QuadradoJFrame() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout()); // Usando FlowLayout para permitir a adição de vários painéis

        QuadradoPanel panel = new QuadradoPanel(1, 1);
        QuadradoPanel panel2 = new QuadradoPanel(2, 2);
        QuadradoPanel panel3 = new QuadradoPanel(3, 3);

        add(panel);
        add(panel2);
        add(panel3);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            QuadradoJFrame frame = new QuadradoJFrame();
            frame.setVisible(true);
        });
    }
}
