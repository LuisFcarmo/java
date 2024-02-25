package herance.obj;

public class pocao_cura {
    int forca;
    public String name;
    public pocao_cura () {
        name = "Poção de restauração";
        forca = dice.roll(100);
    }
    public int get_forca() {return this.forca;};
}
