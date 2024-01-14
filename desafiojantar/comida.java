package desafiojantar;

public class comida {
    int calorias;
    String name;

    comida(){
        this("banana", 300);
    }
    comida(String name, int calorias) {
        this.name = name;
        this.calorias = calorias;
    }
    int get_calorias(){
        return calorias;
    }
}
