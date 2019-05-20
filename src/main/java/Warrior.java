public class Warrior extends Hero {

    private Weapon weapon;
    private String shield;

    public Warrior() {

    }

    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower, String heroShield, Weapon weapon) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.shield = heroShield;
        this.weapon = weapon;
    }

    public Warrior(String heroName, String heroImage, int heroHealth, int heroPower, String heroShield) {
        super(heroName, heroImage, heroHealth, heroPower);
        this.shield = heroShield;
        this.weapon = new Weapon();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getShield() {
        return this.shield;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String toString() {
        return super.toString() +
                "Weapon : " + weapon.description() + "\n" +
                "Shield : " + shield;
    }

}
