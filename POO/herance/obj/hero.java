package herance.obj;


public class hero extends player{
    int especial_point = 0;
    
    public hero () {
        this.set_exp(1);
        this.set_life(100);
        this.set_level(1);
        this.especial_point = 5;
        this.set_name("Jane doe");
    }

    public hero (int ex, int life, int level, String name) {
        this.set_exp(ex);
        this.set_life(life);
        this.set_level(level);
        this.set_name(name);
    }
    @Override
    public int attack (player opponent) {
        //int damage = (this.get_level() + dice.roll(20));
        int damage = 1000;
        opponent.set_life(opponent.get_life() - damage);
        this.especial_point--;
        return damage;
    }
    @Override
    public int attack_2 (player opponent, int dano) {
        int dano_total = (this.get_level() + dice.roll(20) + dano);
        opponent.set_life(opponent.get_life() - dano_total);
        this.especial_point--;
        return dano_total;
    }
}
