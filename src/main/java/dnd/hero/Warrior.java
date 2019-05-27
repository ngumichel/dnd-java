package dnd.hero;

import dnd.offense.Weapon;
import dnd.offense.WeaponAttribute;
import dnd.offense.WeaponType;
import dnd.defense.Shield;
import dnd.defense.ShieldRank;

/**
 * <b>Warrior est une classe qui hérite des attributs de la classe Hero</b>
 * <p>
 * Il possède les caractéristiques suivante :
 * <ul>
 * <li>Une arme de type Weapon</li>
 * <li>Un bouclier de type Shield</li>
 * </ul>
 * </p>
 */
public class Warrior extends Hero {

    public Warrior() {

    }

    /**
     * Constructeur Warrior
     * <p>
     * A la création d'un objet Warrior, il hérite des attributs de Hero.
     * Une arme et un bouclier sont générer aléatoirment à partir d'une énumeration.
     * </p>
     *
     * @param heroName   Le nom du Warrior.
     * @param heroImage  Le lien vers l'image du Warrior.
     * @param heroHealth Le niveau de santé du Warrior.
     * @param heroPower  Le niveau de puissance du Warrior.
     */
    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.genOffense();
        this.genDefense();
    }

    public void genOffense() {
        WeaponAttribute newA = WeaponAttribute.random();
        WeaponType newT = WeaponType.random();
        int newP = newA.getWaPower() + newT.getWtPower();
        super.offense = new Weapon(newA.getWaName(), newT.getWtName(), newP);
    }

    public void genDefense() {
        ShieldRank newSh = ShieldRank.random();
        super.defense = new Shield(newSh.getSrName());
    }

    public String toString() {
        return super.toString() +
                "Weapon : " + offense.description() + "\n" +
                "Shield : " + defense.description() + " Shield";
    }

    public String display() {
        return "Warrior ";
    }

}