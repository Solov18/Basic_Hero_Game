public abstract class BasicHero {
    int id;
    String name;
    String type;
    int initiative;
    int attackLevelBasic;


    public BasicHero(int id, String name, String type, int initiative, int attackLevelBasic) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
        this.attackLevelBasic = attackLevelBasic;
    }
}
