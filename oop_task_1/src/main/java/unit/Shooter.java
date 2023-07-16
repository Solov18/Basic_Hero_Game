package unit;

import java.util.ArrayList;

public abstract class Shooter extends BasicHero {


    public Shooter(int id, String name, String type, int initiative, int attackLevelBasic, int shoots, int healthLevel, int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, healthLevel, x, y);
        this.shots = shoots;
    }
    public int shots;



    @Override
    public String getInfo() {
        return ("Name: " + name + " , "  +" HealLevel: " + healthLevel  + " , " + "Initiative: " + initiative + " , "
                + "Type: " + type + " , " + "X = " + place.x + " , " + "Y = " + place.y + " , " + " Shots "+ shots);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
        if (this.healthLevel <=0 || this.shots ==0) return;
        BasicHero temp = findNameEnemy(enemies);
        temp.healthLevel = temp.healthLevel - this.attackLevelBasic;

        for (BasicHero item:ours) {
            if (item.type.contains("Peasant") ) return;

            
        }
        this.shots--;


    }
}



