package herance.obj;

public class adaga_flamejante extends armas {
    private int especial_point;
    private String name;
    public adaga_flamejante(int dano) {
        super(dano);
        this.especial_point = 20;
        this.name = "Adaga flamejante";
    }
    public int get_especial_point() {return especial_point;}
    public int nuvem_de_fogo() {
        especial_point--;
        return (10)*(dice.roll(3)+1);
    }
    public String get_name() {return this.name;};

    public boolean nuvem_de_poeira() {
        if (3 == dice.roll(3)) {
            return true;
        } else {
            return false;
        }
    }

}
