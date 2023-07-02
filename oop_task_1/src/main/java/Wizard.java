public abstract class Wizard extends BasicHero {

    public Wizard(int id, String name, String type, int initiative, int attackLevelBasic, int heal) {
        super(id, name, type, initiative, attackLevelBasic);
        this.heal = heal;
    }
   public int heal;
}
