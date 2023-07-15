import unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void main(String[] args){

        ArrayList<BasicHero> horde = new ArrayList<>();
        ArrayList<BasicHero> people = new ArrayList<>();

        for (int i = 0; i< 10; i++){
            int a = new Random().nextInt(0,4);

            switch (a){
                case 0:horde.add(new Magician(getName(), 9,new Random().nextInt(0, 50) ));
                break;
                case 1:horde.add(new Outlaw(getName(), 9,new Random().nextInt(0, 50) ));
                    break;
                case 2:horde.add(new Crossbowman(getName(), 9,new Random().nextInt(0, 50) ));
                    break;
                case 3:horde.add(new Peasant(getName(), 9,new Random().nextInt(0, 50) ));
                    break;

            }
        }
        for (int j = 0; j < 10; j++){
            int n = new Random().nextInt(0,4);

            switch (n){
                case 0:people.add(new Monk(getName(), 0,new Random().nextInt(0, 50) ));
                    break;
                case 1:people.add(new Spearman(getName(), 0,new Random().nextInt(0, 50) ));
                    break;
                case 2:people.add(new Sniper(getName(), 0,new Random().nextInt(0, 50)));
                    break;
                case 3:people.add(new Peasant(getName(), 0,new Random().nextInt(0, 50) ));
                    break;

            }
        }
        System.out.println("Команда Орда ");
        horde.forEach(i -> System.out.println(i.getInfo()));
        System.out.println("Команда Люди ");
        people.forEach(j -> System.out.println(j.getInfo()));

        people.forEach(n-> n.step(horde));
        horde.forEach(n-> n.step(people));
    }




}
