package codigos_teste;
public class desafio_cirquilha {
    public static void main(String[] args) {
        String valor = new String("#");
        for(;;) {
            System.out.println(valor);
            if (valor.equals("#####")) break;
            valor += "#";
        }   
    }   
}
