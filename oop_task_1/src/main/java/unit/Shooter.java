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
        return ( name + " , "  +" \u2661 " + healthLevel  + " , "
                + "Type: " + type + " , " + " Shots "+ shots);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
        if (this.healthLevel <=0 || this.shots ==0) return;
        BasicHero nearestEnemy = findNameEnemy(enemies);
        nearestEnemy.getDamage(this.attackLevelBasic);

        for (BasicHero item:ours) {
            if (item.type.contains("Peasant") && !((Peasant)(item)).busy
            && item.healthLevel > 0 ){
                ((Peasant)(item)).busy = true;
                return;

            }


            
        }
        this.shots--;


    }
}



