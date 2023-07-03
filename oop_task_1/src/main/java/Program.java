import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args){
        BasicHero marLin = new Monk("MarLin");
        BasicHero magician = new Magician("Doo");
        BasicHero outlaw = new Outlaw("Sem");
        BasicHero spearman = new Spearman("Qwerty");
        BasicHero sniper = new Sniper("igor");
        BasicHero crossbowman = new Crossbowman("Sasha");
        BasicHero peasant = new Peasant("St");



        ArrayList<BasicHero> team1 = new ArrayList<>();
        team1.add(marLin);
        team1.add(magician);
        team1.add(outlaw);
        team1.add(spearman);
        team1.add(sniper);
        team1.add(crossbowman);
        team1.add(peasant);

        ArrayList<BasicHero> horde = new ArrayList<>();
        ArrayList<BasicHero> people = new ArrayList<>();

        for (int i = 0; i< 10; i++){
            int a = new Random().nextInt(0,4);
            switch (a){
                case 0:horde.add(new Magician(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                break;
                case 1:horde.add(new Outlaw(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case 2:horde.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case 3:horde.add(new Peasant(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;

            }
        }
        for (int j = 0; j < 10; j++){
            int n = new Random().nextInt(0,4);
            switch (n){
                case 0:people.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case 1:people.add(new Spearman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case 2:people.add(new Sniper(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case 3:people.add(new Peasant(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;

            }
        }
        System.out.println("Команда Орда ");
        horde.forEach(i -> System.out.println(i.getInfo()));
        System.out.println("Команда Люди ");
        people.forEach(j -> System.out.println(j.getInfo()));
    }




}
