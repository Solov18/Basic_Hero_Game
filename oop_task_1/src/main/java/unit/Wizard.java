package unit;

import java.util.ArrayList;
public abstract class Wizard extends BasicHero {
    private int heal;
    public Wizard(int id, String name, String type, int initiative, int attackLevelBasic, int healthLevel, int heal, int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, healthLevel, x,y);
        this.heal = heal;

    }

    @Override
    public String getInfo() {
        return (name + " , " +" \u2661 " + healthLevel + " , " + " Type: " + type);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
        if (this.healthLevel > 0 ) {
            for (BasicHero item :ours ) {
               if (item.healthLevel < 98 ) {
                   item.healthLevel += this.heal;
                   return;
               }
               BasicHero nearestEnemy = findNameEnemy(enemies);
               nearestEnemy.healthLevel -= this.heal;
            }
        }


    }
}