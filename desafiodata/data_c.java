package desafiodata;
public class data_c {
    
    byte dia;
    byte mes;
    int ano;

    String data_formatada(){
        String string = String.format("dia (%d) mes (%d) ano (%d)", dia, mes , ano);
        return string;
    }
    //funciona mas não deve ser usada
    void imprimir_data_formatada () {
        System.out.println(data_formatada());
    }
}
