package herance.obj;
public class armas {
    private int dano;
    boolean ativa = false;
    public armas (int dano) {
        this.dano = dano;
        this.ativa = true;
    }
    public int ataque_normal() {
        return dano;
    }
    public boolean esta_ativa() {
        return ativa;
    }

    public void tornar_usavel() {
        this.ativa = true;
    }
}
