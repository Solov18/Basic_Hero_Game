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
               if (item.healthLevel < 88 & item.healthLevel > 0 ) {
                   item.healthLevel += this.heal;
                   System.out.println("Вылечил: " + item.type);
                   return;
               }
               BasicHero nearestEnemy = findNameEnemy(enemies);
                nearestEnemy.getDamage(this.heal);
                System.out.println("Повредил: " + item.type);
            }
        }


    }
}