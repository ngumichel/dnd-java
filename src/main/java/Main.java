import dnd.hero.Hero;
import dnd.hero.Mage;
import dnd.hero.Warrior;
import dnd.philtre.Philtre;
import dnd.philtre.PhiltreRank;
import dnd.shield.Shield;
import dnd.shield.ShieldRank;
import dnd.spell.Spell;
import dnd.spell.SpellAttribute;
import dnd.spell.SpellType;
import dnd.weapon.Weapon;
import dnd.weapon.WeaponAttribute;
import dnd.weapon.WeaponType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Object Warrior;
    private static Object Mage;

    public static void main(String[] args) {

        System.out.println("\n" +
                "  / \\ / \\ / \\ / \\ / \\ / \\ / \\   / \\   / \\ / \\ / \\ / \\ / \\ / \\ / \\ \n" +
                " ( D | U | N | G | E | O | N ) ( & ) ( D | R | A | G | O | N | S )\n" +
                "  \\ / \\ / \\ / \\ / \\ / \\ / \\ /   \\ /   \\ / \\ / \\ / \\ / \\ / \\ / \\ / \n");

        ArrayList<Hero> heroes = new ArrayList<>();
        int choice;
        Scanner home;

        boolean game = true;
        while (game) {

            home = new Scanner(System.in);
            System.out.println("What would you like to do ?\n" +
                    "______________________________________\n" +
                    "1. Create a new Hero\n" +
                    "2. See the list of Heroes\n" +
                    "3. Edit a Hero\n" +
                    "4. End Game");
            try {
                choice = home.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                choice = 0;
                System.out.println();
                System.out.println("Error! Please enter a digit number!");
            }
            home.nextLine();


            switch (choice) {

                case 1:
                    System.out.println("You choose to create a new Hero!");
                    System.out.println();

                    boolean create = true;
                    while (create) {

                        Scanner nameScan = new Scanner(System.in);
                        System.out.println("Choose a name for your hero :");
                        String name = nameScan.nextLine();
                        System.out.println("Your name is : " + name + " !");
                        System.out.println();

                        Scanner pathScan = new Scanner(System.in);
                        System.out.println("Choose your path :\n" +
                                "______________________________________\n" +
                                "1. Path of Power\n" +
                                "2. Path of Wisdom");
                        int path = pathScan.nextInt();
                        System.out.println();


                        if (path == 1) {

                            System.out.println("You have chosen the path of the Warrior !");
                            System.out.println();

                            int heroHealth = (int) (Math.random() * (10 - 5) + 5);
                            int heroPower = (int) (Math.random() * (10 - 5) + 5);

                            Weapon weapon = new Weapon(WeaponAttribute.random(), WeaponType.random());
                            Shield shield = new Shield(ShieldRank.random());

                            int waPower = 0;
                            int wtPower = 0;
                            int weaponPower;

                            switch (weapon.getAttribute()) {
                                case Burning:
                                    waPower = 3;
                                    break;
                                case Frost:
                                    waPower = 2;
                                    break;
                                case Crystal:
                                    waPower = 5;
                                    break;
                                case Storm:
                                    waPower = 7;
                                    break;
                                case Ultimate:
                                    waPower = 9;
                                    break;
                            }

                            switch (weapon.getType()) {
                                case Spear:
                                    wtPower = 7;
                                    break;
                                case Sword:
                                    wtPower = 3;
                                    break;
                                case Greatsword:
                                    wtPower = 8;
                                    break;
                                case Hammer:
                                    wtPower = 6;
                                    break;
                                case Bow:
                                    wtPower = 4;
                                    break;
                            }
                            weaponPower = waPower + wtPower;
                            weapon.setWeaponPower(weaponPower);

                            Hero warrior = new Warrior(name, "image", heroHealth, heroPower, shield, weapon);
                            heroes.add(warrior);
                            System.out.println("Warrior " + warrior.toString());
                            System.out.println();

                        } else if (path == 2) {

                            System.out.println("You have chosen the path of the Mage !");
                            System.out.println();

                            int heroHealth = (int) (Math.random() * (6 - 3) + 3);
                            int heroPower = (int) (Math.random() * (15 - 8) + 8);

                            Spell spell = new Spell(SpellAttribute.random(), SpellType.random());
                            Philtre philtre = new Philtre(PhiltreRank.random());

                            int saPower = 0;
                            int stPower = 0;
                            int spellPower;

                            switch (spell.getAttribute()) {
                                case Fire:
                                    saPower = 4;
                                    break;
                                case Ice:
                                    saPower = 3;
                                    break;
                                case Lightning:
                                    saPower = 5;
                                    break;
                                case Dark:
                                    saPower = 7;
                                    break;
                                case Ultimate:
                                    saPower = 9;
                                    break;
                            }

                            switch (spell.getType()) {
                                case Ball:
                                    stPower = 3;
                                    break;
                                case Beam:
                                    stPower = 6;
                                    break;
                                case Lance:
                                    stPower = 5;
                                    break;
                                case Meteor:
                                    stPower = 8;
                                    break;
                                case Wall:
                                    stPower = 7;
                                    break;
                            }
                            spellPower = saPower + stPower;
                            spell.setSpellPower(spellPower);

                            Hero mage = new Mage(name, "image", heroHealth, heroPower, philtre, spell);
                            heroes.add(mage);
                            System.out.println("Mage " + mage.toString());
                            System.out.println();
                        }

                        boolean error = true;
                        while (error) {

                            Scanner again = new Scanner(System.in);
                            System.out.println("Would you like to create another Hero? yes/no");
                            String answer = again.nextLine();
                            System.out.println();

                            if (answer.equals("yes") || answer.equals("y")) {
                                create = true;
                                error = false;
                            } else if (answer.equals("no") || answer.equals("n")) {
                                create = false;
                                error = false;
                            } else {
                                System.out.println("Error");
                                error = true;
                            }
                        }
                    }
                    break;

                case 2:
                    if (heroes.size() == 0) {
                        System.out.println("You have no Heroes! Go make some~");
                        System.out.println();
                    } else {
                        System.out.println("You choose to see your Heroes!");
                        System.out.println();

                        for (int i = 0; i < heroes.size(); i++) {
                            System.out.println(i + ". " + heroes.get(i));
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    int selected;
                    boolean edit = true;
                    while (edit) {

                        boolean editHero = true;

                        if (heroes.size() == 0) {
                            System.out.println("You have no Heroes! Go make some~");
                            edit = false;
                        } else {

                            System.out.println("Select your Hero!\n" +
                                    "______________________________________\n");

                            for (int i = 0; i < heroes.size(); i++) {
                                System.out.println(i + ". " + heroes.get(i));
                                System.out.println();
                            }

                            Scanner selectHero = new Scanner(System.in);
                            System.out.println("Enter the number of your Hero : ");

                            try {
                                selected = selectHero.nextInt();
                                System.out.println();

                                if (selected == 88) {
                                    edit = false;
                                } else {

                                    int editAnswer;
                                    while (editHero) {

                                        String selectedClass = heroes.get(selected).getClass().getSimpleName();

                                        System.out.println("Selected " + selectedClass + " : " + heroes.get(selected));
                                        System.out.println();

                                        Scanner editChoice = new Scanner(System.in);
                                        System.out.println("What would you like to do ?\n" +
                                                "______________________________________\n" +
                                                "1. Change your name\n" +
                                                "2. Change your equipments\n" +
                                                "3. Delete your Hero\n" +
                                                "4. Back to Hero selection\n" +
                                                "5. Back to main menu");
                                        try {
                                            editAnswer = editChoice.nextInt();
                                            System.out.println();
                                        } catch (InputMismatchException e) {
                                            editAnswer = 0;
                                            System.out.println();
                                            System.out.println("Error! Please enter a digit number!");
                                        }
                                        editChoice.nextLine();

                                        switch (editAnswer) {
                                            case 1:
                                                Scanner newNameInput = new Scanner(System.in);
                                                System.out.println("Enter your new name : ");
                                                String newName = newNameInput.nextLine();
                                                heroes.get(selected).setName(newName);
                                                System.out.println("Your new name is " + newName);
                                                System.out.println();
                                                break;

                                            case 2:
                                                Class heroClass = heroes.get(selected).getClass();

                                                if (Warrior.class.equals(heroClass)) {
                                                    Weapon weapon = new Weapon(WeaponAttribute.random(), WeaponType.random());
                                                    Shield shield = new Shield(ShieldRank.random());

                                                    int waPower = 0;
                                                    int wtPower = 0;
                                                    int weaponPower;

                                                    switch (weapon.getAttribute()) {
                                                        case Burning:
                                                            waPower = 3;
                                                            break;
                                                        case Frost:
                                                            waPower = 2;
                                                            break;
                                                        case Crystal:
                                                            waPower = 5;
                                                            break;
                                                        case Storm:
                                                            waPower = 7;
                                                            break;
                                                        case Ultimate:
                                                            waPower = 9;
                                                            break;
                                                    }

                                                    switch (weapon.getType()) {
                                                        case Spear:
                                                            wtPower = 7;
                                                            break;
                                                        case Sword:
                                                            wtPower = 3;
                                                            break;
                                                        case Greatsword:
                                                            wtPower = 8;
                                                            break;
                                                        case Hammer:
                                                            wtPower = 6;
                                                            break;
                                                        case Bow:
                                                            wtPower = 4;
                                                            break;
                                                    }
                                                    weaponPower = waPower + wtPower;
                                                    weapon.setWeaponPower(weaponPower);

                                                    ((Warrior) heroes.get(selected)).setWeapon(weapon);
                                                    ((Warrior) heroes.get(selected)).setShield(shield);

                                                } else if (Mage.class.equals(heroClass)) {
                                                    Spell spell = new Spell(SpellAttribute.random(), SpellType.random());
                                                    Philtre philtre = new Philtre(PhiltreRank.random());
                                                    int saPower = 0;
                                                    int stPower = 0;
                                                    int spellPower;

                                                    switch (spell.getAttribute()) {
                                                        case Fire:
                                                            saPower = 4;
                                                            break;
                                                        case Ice:
                                                            saPower = 3;
                                                            break;
                                                        case Lightning:
                                                            saPower = 5;
                                                            break;
                                                        case Dark:
                                                            saPower = 7;
                                                            break;
                                                        case Ultimate:
                                                            saPower = 9;
                                                            break;
                                                    }

                                                    switch (spell.getType()) {
                                                        case Ball:
                                                            stPower = 3;
                                                            break;
                                                        case Beam:
                                                            stPower = 6;
                                                            break;
                                                        case Lance:
                                                            stPower = 5;
                                                            break;
                                                        case Meteor:
                                                            stPower = 8;
                                                            break;
                                                        case Wall:
                                                            stPower = 7;
                                                            break;
                                                    }
                                                    spellPower = saPower + stPower;
                                                    spell.setSpellPower(spellPower);

                                                    ((Mage) heroes.get(selected)).setSpell(spell);
                                                    ((dnd.hero.Mage) heroes.get(selected)).setPhiltre(philtre);
                                                }
                                                break;

                                            case 3:
                                                editHero = false;
                                                heroes.remove(selected);
                                                break;

                                            case 4:
                                                editHero = false;
                                                break;

                                            case 5:
                                                editHero = false;
                                                edit = false;
                                                break;

                                            default:
                                                System.out.println("Error! Please select one of the available option!");
                                                System.out.println();
                                                break;
                                        }
                                    }
                                }
                            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                                selected = 0;
                                editHero = false;
                                System.out.println();
                                System.out.println("Error! Please enter a valid number!");
                                System.out.println();
                            }
                            selectHero.nextLine();
                        }
                    }
                    break;

                case 4:
                    game = false;
                    break;

                default:
                    System.out.println("Error! Please select one of the available option!");
                    System.out.println();
            }
        }
    }

}