public class Peasant extends BasicHero{ // Крестьянин
    public Peasant(String name) {
        super(3, name, "Peasant", 1, 0);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return ("Name: " + name +" , " + "Type: " + type);
    }
}
