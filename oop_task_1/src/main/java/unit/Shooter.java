package unit;

import java.util.ArrayList;

public abstract class Shooter extends BasicHero {
    public Shooter(int id, String name, String type, int initiative, int attackLevelBasic,int x, int y) {
        super(id, name, type, initiative, attackLevelBasic, x,y );
    }
    @Override
    public String getInfo() {
        return ("Name: " + name +" , " + "Type: " + type +" " + "X = " + place.x + " " + "Y = " + place.y  );
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] temp = findNameEnemy(enemies);
        System.out.println("LN = " +temp[0] + " Enemy Name " + enemies.get(temp[1]).name);
    }
}
