package dnd.hero;

import dnd.philtre.PhiltreRank;
import dnd.spell.Spell;
import dnd.philtre.Philtre;
import dnd.spell.SpellAttribute;
import dnd.spell.SpellType;

public class Mage extends Hero {

    private Spell spell;
    private Philtre philtre;

    public Mage() {
    }

    public Mage(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.spell = genSpell();
        this.philtre = genPhiltre();
    }

    public Spell genSpell() {
        SpellAttribute newA = SpellAttribute.random();
        SpellType newT = SpellType.random();
        int newP = newA.getSaPower() + newT.getStPower();
        return new Spell(newA.getSaName(), newT.getStName(), newP);
    }

    public Philtre genPhiltre() {
        return new Philtre(PhiltreRank.random());
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