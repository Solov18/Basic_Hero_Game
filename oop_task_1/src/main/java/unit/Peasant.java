package unit;

import java.util.ArrayList;

public class Peasant extends BasicHero {// Крестьянин
    public Peasant(String name, int x, int y ) {
        super(9, name, "unit.Peasant", 3, 7, 100, x, y);
    }


    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {


    }

    @Override
    public String getInfo() {
        return ("Name: " + name + " , " +" HealLevel: " + healthLevel + " , "  + "Initiative: " + initiative +
                " , " + " Type: " + type + " " + "X = " + place.x + " " + "Y = " + place.y);
    }
}
