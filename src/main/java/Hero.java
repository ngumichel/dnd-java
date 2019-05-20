public class Hero {

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

    public String toString() {
        return "Here comes a new challenger : " + name + " !" + "\n" +
                "Health : " + health + "\n" +
                "Power : " + power + "\n";
    }

}
