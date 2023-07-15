package unit;

import java.util.ArrayList;

public class Peasant extends BasicHero{ // Крестьянин
    public Peasant(String name, int x, int y) {

        super(3, name, "unit.Peasant", 1, 0, x,y );
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] temp = findNameEnemy(enemies);
        System.out.println("LN = " +temp[0] + " Enemy Name " + enemies.get(temp[1]).name);

    }

    @Override
    public String getInfo() {
        return ("Name: " + name +" , " + "Type: " + type +" " + "X = " + place.x + " " + "Y = " + place.y  );
    }
}
