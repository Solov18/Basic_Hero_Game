import unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Program {
   static ArrayList<BasicHero> unitedTeam = new ArrayList<>();
   static ArrayList<BasicHero> horde = new ArrayList<>();
   static ArrayList<BasicHero> people = new ArrayList<>();

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void main(String[] args){

        for (int i = 1; i< 11; i++){
            int a = new Random().nextInt(0,4);

            switch (a){
                case 0:horde.add(new Magician(getName(), 1,i) );
                break;
                case 1:horde.add(new Outlaw(getName(), 1,i));
                    break;
                case 2:horde.add(new Crossbowman(getName(), 1,i));
                    break;
                case 3:horde.add(new Peasant(getName(), 1,i));
                    break;

            }
        }
        for (int j = 1; j < 11; j++){
            int n = new Random().nextInt(0,4);

            switch (n){
                case 0:people.add(new Monk(getName(), 10,j));
                    break;
                case 1:people.add(new Spearman(getName(), 10,j));
                    break;
                case 2:people.add(new Sniper(getName(), 10,j));
                    break;
                case 3:people.add(new Peasant(getName(),10,j));
                    break;

            }
        }

        unitedTeam.addAll(people);
        unitedTeam.addAll(horde);
        unitedTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());


        View.view();

        for (BasicHero item : unitedTeam) {
            if (people.contains(item)){
                item.step(horde, people);
            } else {
                item.step(people, horde);
            }


        }
        View.view();


    }




}
