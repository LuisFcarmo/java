package desafiojantar;

public class exercicios {
    static void correr(int minutos, pessoa x){
        int novo_peso = x.get_peso() - (minutos*2);
        x.set_peso(novo_peso);
    }
    static void esteira(int minutos, pessoa x){
        int novo_peso = x.get_peso() - (minutos*3);
        x.set_peso(novo_peso);
    }
    static void levantar_peso(int minutos, pessoa x){
        int novo_peso = x.get_peso() - minutos;
        x.set_peso(novo_peso);
    }
    static void lutar(int minutos, pessoa x){
        int novo_peso = x.get_peso() - (minutos*2);
        x.set_peso(novo_peso);
    }
}
