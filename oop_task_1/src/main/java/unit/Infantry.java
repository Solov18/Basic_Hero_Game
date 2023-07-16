package unit;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero { // Пехота
    public Infantry(int id, String name, String type, int initiative, int attackLevelBasic, int healthLevel, int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, 100, x , y);
    }




    @Override
    public String getInfo() {
        return ("Name: " + name +" , " +" HealLevel: " + healthLevel + " , " + "Initiative: " + initiative + " , "
                + "Type: " + type +" , " + "X = " + place.x + " , " + "Y = " + place.y  );
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {


    }

}