package teste;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class primeiroframe {
    public static void main(String[] args) {
   /*
            criando a janela basica
        */
        JFrame frame = new JFrame();
        frame.setTitle("meu primeiro frame"); //set o titulo da janela
        //frame.setResizable(false); //n deixa a janela ser risize
        frame.setSize(420, 402); // set x e y

        /*
            alterando caracteristicas basicas como titulo redimensionamento
        */
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // sai da aplicação mas n faz nada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sai da aplicação
        //frame.setLayout(null);

        //colocando imagens alterando cores do fundo
        ImageIcon image = new ImageIcon("javacrash.png");
        frame.setIconImage(image.getImage()); //muda o icone do frame
        frame.getContentPane().setBackground(Color.green);
        Border border = BorderFactory.createLineBorder(Color.black, 3);

        JLabel label = new JLabel("do even code ?");
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, rigth of image icon
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text top center bottom
        label.setForeground(Color.BLUE);// colocar cor no texto
        label.setFont(new Font("MV boli", Font.BOLD, 20));// coloca uma font no label
        label.setIconTextGap(100); // coloca distância entre as imagens e o texto
        label.setBackground(Color.red); // coloca cor no fundo da imagem
        label.setOpaque(true);  // pesquisar melhor sobre
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // redimensiona o objeto label no centro da janela
        label.setHorizontalAlignment(JLabel.CENTER); // redimenseion o objeto no centro da janela
        //label.setBounds(0, 0, 200, 200); // seta o x y position of label in frame
        frame.add(label);
        frame.pack(); // redimensiona tudo na frame para o tamanho atual delta



        frame.setVisible(true); // deixa ele visivel

        //criando labels
        
        


    }
}