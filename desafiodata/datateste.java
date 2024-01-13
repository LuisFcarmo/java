package desafiodata;
public class datateste {
    public static void main(String[] args) {
        data_c data = new data_c();
        data.dia = 1;
        data.mes = 1;
        data.ano = 2002;
        String saida = data.data_formatada();
        System.err.println(saida);
    }
}
