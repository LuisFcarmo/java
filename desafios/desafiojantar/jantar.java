package desafiojantar;

public class jantar {
    public static void main(String[] args) {
        int peso_anterior = 0;
        pessoa marcos = new pessoa(50 ,"marcos", 1.5);
        peso_anterior = marcos.get_peso();
        comida peixe = new comida("peixe", 7);
        comida cereal = new comida("cereal", 10);
        comida arroz = new comida("arroz", 3);
        comida feijao = new comida("feijão", 2);
        marcos.comer(peixe);
        marcos.comer(cereal);
        marcos.comer(arroz);
        marcos.comer(feijao);
        System.out.printf("muçei engordei %d kilos\n", (marcos.get_peso() - peso_anterior));
        System.out.printf("peso anterior = %d kilos peso atual = %d kilos\n", peso_anterior, marcos.get_peso());
        marcos.verificar_saude();
        peso_anterior = marcos.get_peso();

        System.out.println("vamos malhar um pouquinho para perder uns kilinhos :)\n");
        exercicios.correr(1, marcos);
        exercicios.esteira(2, marcos);
        exercicios.levantar_peso(2, marcos);
        exercicios.lutar(1, marcos);
        
        System.out.println("ufa cansei\n");
        System.out.printf("perdi %d kilos\n", (marcos.get_peso() - peso_anterior));
        System.out.printf("peso anterior = %d peso atual = %d\n", peso_anterior, marcos.get_peso());
        marcos.verificar_saude();
        
    }
}
