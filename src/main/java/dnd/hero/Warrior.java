package dnd.hero;

import dnd.shield.ShieldRank;
import dnd.weapon.Weapon;
import dnd.shield.Shield;
import dnd.weapon.WeaponAttribute;
import dnd.weapon.WeaponType;

/**
 * <b>Warrior est une classe qui hérite des attributs de la classe Hero</b>
 * <p>
 *     Il possède les caractéristiques suivante :
 *     <ul>
 *         <li>Une arme de type Weapon</li>
 *         <li>Un bouclier de type Shield</li>
 *     </ul>
 * </p>
 */
public class Warrior extends Hero {

    private Weapon weapon;
    private Shield shield;

    public Warrior() {

    }

    /**
     * Constructeur Warrior
     * <p>
     *     A la création d'un objet Warrior, il hérite des attributs de Hero.
     *     Une arme et un bouclier sont générer aléatoirment à partir d'une énumeration.
     * </p>
     *
     * @param heroName
     *          Le nom du Warrior.
     * @param heroImage
     *          Le lien vers l'image du Warrior.
     * @param heroHealth
     *          Le niveau de santé du Warrior.
     * @param heroPower
     *          Le niveau de puissance du Warrior.
     */
    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.weapon = genWeapon();
        this.shield = genShield();
    }

    /**
     * Génère une arme aléatoirement à partir d'une liste d'énumeration.
     *
     * @return L'arme générée.
     */
    public Weapon genWeapon() {
        WeaponAttribute newA = WeaponAttribute.random();
        WeaponType newT = WeaponType.random();
        int newP = newA.getWaPower() + newT.getWtPower();
        return new Weapon(newA.getWaName(), newT.getWtName(), newP);
    }

    /**
     * Génère un bouclier aléatoirement à partir d'une liste d'énumeration.
     *
     * @return Le bouclier généré.
     */
    public Shield genShield() {
        return new Shield(ShieldRank.random());
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public Shield getShield() {
        return this.shield;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Weapon : " + weapon.description() + "\n" +
                "Shield : " + shield.description() + " Shield";
    }

}