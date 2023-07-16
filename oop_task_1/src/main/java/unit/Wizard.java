package unit;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {

    public Wizard(int id, String name, String type, int initiative, int attackLevelBasic, int healthLevel, int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, healthLevel, x,y);

    }

    @Override
    public String getInfo() {
        return ("Name: " + name + " , " +" HealLevel: " + healthLevel + " , "  + "Initiative: " + initiative +
                " , " + " Type: " + type + " , " + "X = " + place.x + " , " + "Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {

    }
}