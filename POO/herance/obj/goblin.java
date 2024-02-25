package herance.obj;

public class goblin extends player {
    type monster_type;
    int range_atack = 15;
    public goblin (int life) {
        monster_type = type.COMMON;
        this.set_name( "DARK GOBLIN");
        this.set_life(life);
    }
    @Override
    public int attack (player opponent) {
        int damage = (dice.roll(10));
        opponent.set_life(opponent.get_life()-damage);
        return damage;
    }
}

