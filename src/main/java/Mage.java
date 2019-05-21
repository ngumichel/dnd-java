public class Mage extends Hero {

    private Spell spell;
    private Philtre philtre;

    public Mage() {
    }

    public Mage(String heroName, String heroImage, int heroHealth, int heroPower, Philtre heroPhiltre, Spell spell) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.philtre = heroPhiltre;
        this.spell = spell;
    }

    public Mage(String heroName, String heroImage, int heroHealth, int heroPower, Philtre heroPhiltre) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.philtre = heroPhiltre;
        this.spell = new Spell();
    }

    public Spell getSpell() {
        return this.spell;
    }

    public Philtre getPhiltre() {
        return philtre;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setPhiltre(Philtre philtre) {
        this.philtre = philtre;
    }

    public String toString() {
        return super.toString() +
                "Spell : " + spell.description() + "\n" +
                "Philtre : " + philtre.description() + " Philtre";
    }

}
