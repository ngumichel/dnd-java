package dnd.hero;

import dnd.weapon.Weapon;
import dnd.shield.Shield;

public class Warrior extends Hero {

    private Weapon weapon;
    private Shield shield;

    public Warrior() {

    }

    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower, Shield heroShield, Weapon weapon) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.shield = heroShield;
        this.weapon = weapon;
    }

    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.shield = new Shield();
        this.weapon = new Weapon();
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

    public String toString() {
        return super.toString() +
                "Weapon : " + weapon.description() + "\n" +
                "Shield : " + shield.description() + " Shield";
    }

}