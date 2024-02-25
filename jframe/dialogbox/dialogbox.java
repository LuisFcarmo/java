package dialogbox;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dialogbox {
    public static void main(String[] args) {
        /*
        JOptionPane.showMessageDialog(null, "isso aqui é informação", "tituilo", JOptionPane.INFORMATION_MESSAGE);  
        JOptionPane.showMessageDialog(null, "isso aqui é informação", "tituilo", JOptionPane.QUESTION_MESSAGE);  
        JOptionPane.showMessageDialog(null, "isso aqui é informação", "tituilo", JOptionPane.WARNING_MESSAGE);  
        JOptionPane.showMessageDialog(null, "seu computador está com viros amigão", "tituilo", JOptionPane.PLAIN_MESSAGE);  
        JOptionPane.showMessageDialog(null, "isso aqui é informação", "tituilo", JOptionPane.ERROR_MESSAGE);  
        */
        String[] respostas = {"aaa", "eita"};
        ImageIcon icon = new ImageIcon();
        //retorna um para não 0 para sim e 2 para cancelar
            //System.err.println(JOptionPane.showConfirmDialog(null, "mano vc é feliz ?", "meu titulo", JOptionPane.YES_NO_CANCEL_OPTION));
            //System.err.println(JOptionPane.showInputDialog("seu nome maninho ?"));
        JOptionPane.showOptionDialog(null, "aaaaaa", "lalallal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, icon, respostas, 0);

    }
}
