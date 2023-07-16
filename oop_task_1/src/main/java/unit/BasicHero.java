package unit;

import java.util.ArrayList;

public abstract class BasicHero implements Actions {
    public
    int healthLevel;
    int id;
    String name;
    String type;
  protected   int initiative;

    public int getInitiative() {
        return initiative;
    }

    int attackLevelBasic;


    protected Coordinates place;


    public BasicHero(int id, String name, String type, int initiative, int attackLevelBasic, int healthLevel, int x, int y) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
        this.attackLevelBasic = attackLevelBasic;
        this.healthLevel = healthLevel;
        place = new Coordinates(x, y);
    }


    protected BasicHero findNameEnemy(ArrayList<BasicHero> enemies) {
        double min = 1000;
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }

        }
        return enemies.get(count);
    }
}

