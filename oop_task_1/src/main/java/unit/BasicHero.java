package unit;

import java.util.ArrayList;

public abstract class BasicHero implements Actions {
    int id;
    String name;
    String type;
    int initiative;
    int attackLevelBasic;

    protected Coordinates place;


    public BasicHero(int id, String name, String type, int initiative, int attackLevelBasic, int x, int y) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
        this.attackLevelBasic = attackLevelBasic;
        place = new Coordinates(x, y);
    }


    protected int[] findNameEnemy(ArrayList<BasicHero> enemies) {
        double min = 10000;
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }

        }
        return new int[]{(int) Math.round(min),count};
    }
}

