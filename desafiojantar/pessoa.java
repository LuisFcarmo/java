package desafiojantar;

public class pessoa {
    int peso;
    String nome;
    double altura;

    pessoa(){
        this(49 ,"heloisa", 1.9);
    }

    pessoa(int peso, String nome, double altura) {
        this.peso = peso;
        this.nome = nome;
        this.altura = altura;
    }
    void comer(comida x){
        set_peso(this.peso += x.get_calorias());
    }

    int get_peso() {
        return peso;
    }

    void set_peso(int peso){
        this.peso = peso;
    }

    void verificar_saude(){
        double cimc = peso/(Math.pow(altura, 2.0));
        if (cimc < 16.9) {
            System.out.println("muito abaixo do peso");
        } 
        else if ((cimc > 17) && (cimc < 18.4)) {
            System.out.println("abaixo do peso");
        }

        else if ((cimc > 18.4) && (cimc < 24.9)) {
            System.out.println("peso normal");
        }

        else if ((cimc > 24.9) && (cimc < 29.9)) {
            System.out.println("acima do peso normal");
        }
        else if ((cimc > 29.9) && (cimc < 34.9)) {
            System.out.println("obesidade grau 1");
        }
        else if ((cimc > 34.9) && (cimc < 40)) {
            System.out.println("obesidade grau 2");
        } 
        else {
            System.out.println("obesidade grau 3");
        }
    }
}
