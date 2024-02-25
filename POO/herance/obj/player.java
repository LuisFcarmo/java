package herance.obj;

public class player {
    private int life;
    private int level;
    private int exp;
    private String name;
    
    public int get_exp() {return this.exp;}; 

    public String get_name() {return this.name;};
 
    public int get_life() {return this.life;}; 

    public int get_level() {return this.level;};

    public void set_exp(int xp) {
        if (xp > 0) {
            this.exp = xp;
        }
    }

    public void set_life(int life) {
        this.life = life;
    }

    public void set_level(int level) {
        if (level > 0) {
            this.level = level;
        }
    }

    public void set_name(String name) {
        this.name = name;
    }
    public int attack (player opponent) {
        opponent.life -= 10;
        return 10;
    }
    
    public int attack_2 (player opponent, int damage) {
        opponent.life -= 10;
        return 10;
    }

    public boolean is_alive () {
        return (this.life > 0) ? (true): (false);
    }

    public boolean try_to_dodge () {
        return dodge(dice.roll(6));
    }

    public boolean dodge(int dodge_rate) {
        if (dodge_rate == dice.roll(6)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean level_up () {
        if (this.get_exp() % 50 == 0) {
            this.set_exp(0);
            this.set_level(this.get_exp()+1);;
            return true;
        }
        return false;
    }

    public void heal (int cure_point, player x) {
        x.life += cure_point;
    }
}
