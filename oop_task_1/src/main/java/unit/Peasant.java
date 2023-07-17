package unit;

import java.util.ArrayList;

public class Peasant extends BasicHero {// Крестьянин

    public Peasant(String name, int x, int y) {
        super(9, name, "Peasant", 3, 7, 100, x, y);
    }

    public boolean busy = false;


    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel == 0) this.busy = false;


    }

    @Override
    public String getInfo() {
        return ( name + " , " + " \u2661 " + healthLevel + " , " + " Type: " + type );
    }
}
