package dnd.hero;

import dnd.offense.Spell;
import dnd.offense.SpellAttribute;
import dnd.offense.SpellType;
import dnd.defense.Philtre;
import dnd.defense.PhiltreRank;

/**
 * <b>Mage est une classe qui hérite des attributs de la classe Hero</b>
 * <p>
 * Il possède les caractéristiques suivante :
 * <ul>
 * <li>Un sort de type Weapon</li>
 * <li>Un philtre de type Philtre</li>
 * </ul>
 * </p>
 */
public class Mage extends Hero {

    public Mage() {

    }

    /**
     * Constructeur Mage
     * <p>
     * A la création d'un objet Mage, il hérite des attributs de Hero.
     * Un sort et un philtre sont générer aléatoirment à partir d'une énumeration.
     * </p>
     *
     * @param heroName   Le nom du Mage.
     * @param heroImage  Le lien vers l'image du Mage.
     * @param heroHealth Le niveau de santé du Mage.
     * @param heroPower  Le niveau de puissance du Mage.
     */
    public Mage(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.genOffense();
        this.genDefense();
    }

    public void genOffense() {
        SpellAttribute newA = SpellAttribute.random();
        SpellType newT = SpellType.random();
        int newP = newA.getSaPower() + newT.getStPower();
        super.offense = new Spell(newA.getSaName(), newT.getStName(), newP);
    }

    public void genDefense() {
        PhiltreRank newPh = PhiltreRank.random();
        super.defense = new Philtre(newPh.getPrName());
    }

    public String toString() {
        return super.toString() +
                "Spell : " + offense.description() + "\n" +
                "Philtre : " + defense.description() + " Philtre";
    }

}