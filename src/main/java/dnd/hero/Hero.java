package dnd.hero;

import dnd.defense.Defense;
import dnd.offense.Offense;
import dnd.exception.DefenseException;
import dnd.exception.OffenseException;

/**
 * <b>Hero est une classe abstraite représentant les personnages du jeu D&D</b>
 * <p>
 * Un Hero possède les caractéristiques suivantes :
 * <ul>
 * <li>Un nom</li>
 * <li>Une image</li>
 * <li>Un niveau de santé</li>
 * <li>Un niveau de puissance</li>
 * </ul>
 * </p>
 */
public abstract class Hero {

    private String name;
    private String image;
    private int health;
    private int power;
    protected Offense offense;
    protected Defense defense;

    public Hero() {

    }

    /**
     * Constructeur Hero.
     * <p>
     * A la construction d'un Hero, le "heroHealth" et le "heroPower" est fixé aléatoirement avec un Math.random()
     * </p>
     *
     * @param heroName   Le nom du Hero.
     * @param heroImage  Le lien vers l'image du Hero.
     * @param heroHealth Le niveau de santé du Hero.
     * @param heroPower  Le niveau de puissance du Hero.
     */
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

    public Offense getOffense() {
        return offense;
    }

    public Defense getDefense() {
        return defense;
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

    public void setOffense(Offense offense) throws OffenseException {
        throw new OffenseException();
    }

    public void setDefense(Defense defense) throws DefenseException {
        throw new DefenseException();
    }

    @Override
    public String toString() {
        return display() + name + "\n" +
                "Health : " + health + "\n" +
                "Power : " + power + "\n";
    }

    public abstract void genOffense();

    public abstract void genDefense();

    public abstract String display();
}