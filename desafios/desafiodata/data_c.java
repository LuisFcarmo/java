package desafiodata;
public class data_c {
    
    byte dia;
    byte mes;
    int ano;
    data_c(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    data_c(byte dia_p, byte mes_p , int ano_p) {
        dia = dia_p;
        mes = mes_p;
        ano = ano_p;
    }
    
    String data_formatada(){
        String string = String.format("dia (%d) mes (%d) ano (%d)", dia, mes , ano);
        return string;
    }
    //funciona mas não deve ser usada
    void imprimir_data_formatada () {
        System.out.println(data_formatada());
    }
}
