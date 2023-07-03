public abstract class Infantry extends BasicHero { // Пехота
    public Infantry(int id, String name, String type, int initiative, int attackLevelBasic) {
        super(id, name, type, initiative, attackLevelBasic);

    }

    @Override
    public String getInfo() {
        return ("Name: " + name +" , " + "Type: " + type);
    }

    @Override
    public void step() {
    }
}