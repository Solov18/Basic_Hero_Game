package unit;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero { // Пехота
    public Infantry(int id, String name, String type, int initiative, int attackLevelBasic, int healthLevel, int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, 100, x, y);
    }


    @Override
    public String getInfo() {
        return (name + " , " + " \u2661 " + healthLevel + " , "
                + "Type: " + type);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel <= 0) return;
        BasicHero nearestEnemy = findNameEnemy(enemies);
        if (this.place.calcDistance(nearestEnemy.place) < 2) {
            nearestEnemy.getDamage(this.attackLevelBasic);
            return;
        }
        Coordinates tempc = new Coordinates(place.x, place.y);
        if (Math.abs(this.place.x - nearestEnemy.place.x) > Math.abs(this.place.y - nearestEnemy.place.y)) {
            if (this.place.x < nearestEnemy.place.x) {
                tempc.x += 1;
            } else {
                tempc.x -= 1;
            }
        } else {
            if (this.place.y < nearestEnemy.place.y) {
                tempc.y += 1;
            } else {
                tempc.y -= 1;
            }
        }
        boolean flag = false;
        for (BasicHero item:ours) {
            if (item.place.x == tempc.x & item.place.y == tempc.y & item.healthLevel > 0) flag = true;
        }
        if (flag) return;
        this.place.x = tempc.x;
        this.place.y = tempc.y;

    }
}