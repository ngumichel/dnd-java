package dnd.hero;

import dnd.philtre.PhiltreRank;
import dnd.spell.Spell;
import dnd.philtre.Philtre;
import dnd.spell.SpellAttribute;
import dnd.spell.SpellType;

/**
 * <b>Mage est une classe qui hérite des attributs de la classe Hero</b>
 * <p>
 *     Il possède les caractéristiques suivante :
 *     <ul>
 *         <li>Un sort de type Weapon</li>
 *         <li>Un philtre de type Philtre</li>
 *     </ul>
 * </p>
 */
public class Mage extends Hero {

    private Spell spell;
    private Philtre philtre;

    public Mage() {

    }

    /**
     * Constructeur Mage
     * <p>
     *     A la création d'un objet Mage, il hérite des attributs de Hero.
     *     Un sort et un philtre sont générer aléatoirment à partir d'une énumeration.
     * </p>
     *
     * @param heroName
     *          Le nom du Mage.
     * @param heroImage
     *          Le lien vers l'image du Mage.
     * @param heroHealth
     *          Le niveau de santé du Mage.
     * @param heroPower
     *          Le niveau de puissance du Mage.
     */
    public Mage(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.spell = genSpell();
        this.philtre = genPhiltre();
    }

    /**
     * Génère un sort aléatoirement à partir d'une liste d'énumeration.
     *
     * @return Le sort généré.
     */
    public Spell genSpell() {
        SpellAttribute newA = SpellAttribute.random();
        SpellType newT = SpellType.random();
        int newP = newA.getSaPower() + newT.getStPower();
        return new Spell(newA.getSaName(), newT.getStName(), newP);
    }

    /**
     * Génère un philtre aléatoirement à partir d'une liste d'énumeration.
     *
     * @return Le philtre généré.
     */
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