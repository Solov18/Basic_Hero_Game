package unit;

import java.util.ArrayList;

public interface Actions {

    void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours );
    String getInfo();
}

