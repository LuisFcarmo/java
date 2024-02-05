package andando;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;

public class janela extends JFrame {

    janela() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.blue);
        this.setVisible(true);
    }

    void monitor (cube personagem) {
        addKeyListener(new KeyAdapter() {
            int x = personagem.get_x();
            int y = personagem.get_y();

            public void keyPressed(KeyEvent e) {
                int codigo = e.getKeyCode();
                if (codigo == KeyEvent.VK_D) {
                    x += 50;
                    if (x >= 500) {
                        x %= 500;
                    }
                    personagem.set_position(x, y);

                }
                else if (codigo == KeyEvent.VK_A) {
                    x -= 50;
                    if (x < 0) {
                        x = 500;
                    }
                    personagem.set_position(x, y);

                }
                else if (codigo == KeyEvent.VK_W) {
                    y -= 50;
                    if (y < 0) {
                        y = 500;
                    }
                    personagem.set_position(x, y);

                }
                else if (codigo == KeyEvent.VK_S) {
                    y += 50;
                    if (y >= 500) {
                        y %= 500;
                    }
                    personagem.set_position(x, y);

                }
            } 
        });
        this.add(personagem.cubo);
    }

}
