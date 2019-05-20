public class Mage extends Hero {

    private Spell spell;
    private String philtre;

    public Mage() {
    }

    public Mage(String heroName, String heroImage, int heroHealth, int heroPower, String heroPhiltre, Spell spell) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.philtre = heroPhiltre;
        this.spell = spell;
    }

    public Mage(String heroName, String heroImage, int heroHealth, int heroPower, String heroPhiltre) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.philtre = heroPhiltre;
        this.spell = spell;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    public String toString() {
        return super.toString() +
                "Spell : " + spell.description() + "\n" +
                "Philtre : " + philtre;
    }

}
