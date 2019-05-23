package dnd.hero;

public abstract class Hero {

    private String name;
    private String image;
    private int health;
    private int power;

    public Hero() {

    }

    public Hero(String heroName, String heroImage, int heroHealth, int heroPower) {
        this.name = heroName;
        this.image = heroImage;
        this.health = heroHealth;
        this.power = heroPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return name + "\n" +
                "Health : " + health + "\n" +
                "Power : " + power + "\n";
    }

}