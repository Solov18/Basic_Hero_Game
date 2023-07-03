public abstract class Shooter extends BasicHero {
    public Shooter(int id, String name, String type, int initiative, int attackLevelBasic) {
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
