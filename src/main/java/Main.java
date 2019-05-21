import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object Warrior;
    private static Object Mage;

    public static void main(String[] args) {

        Hero[] heroes = new Hero[10];

        boolean game = true;
        while (game) {

            Scanner home = new Scanner(System.in);
            System.out.println("DUNGEON & DRAGON");
            System.out.println();
            System.out.println("What would you like to do ?\n" +
                    "1. Create a new Hero\n" +
                    "2. See the list of Heroes\n" +
                    "3. Edit a Hero\n" +
                    "4. End Game");
            int choice = home.nextInt();
            System.out.println();

            switch (choice) {

                case 1:
                    System.out.println("You choose to create a new Hero!");
                    System.out.println();

                    int index = 0;

                    boolean create = true;
                    while (create) {

                        Scanner nameScan = new Scanner(System.in);
                        System.out.println("Choose a name for your hero :");
                        String name = nameScan.nextLine();
                        System.out.println("Your name is : " + name + " !");
                        System.out.println();

                        Scanner pathScan = new Scanner(System.in);
                        System.out.println("Choose your path :\n" + "1. Path of Power\n" + "2. Path of Wisdom");
                        int path = pathScan.nextInt();
                        System.out.println();


                        if (path == 1) {

                            System.out.println("You have chosen the path of the Warrior !");
                            System.out.println();

                            int heroHealth = (int) (Math.random() * (10 - 5) + 5);
                            int heroPower = (int) (Math.random() * (10 - 5) + 5);

                            Weapon weapon = new Weapon(WeaponAttribute.random(), WeaponType.random());
                            Shield shield = new Shield(ShieldRank.random());

                            int aPower = 0;
                            int tPower = 0;
                            int weaponPower;

                            switch (weapon.getAttribute()) {
                                case Burning:
                                    aPower = 3;
                                    break;
                                case Frost:
                                    aPower = 2;
                                    break;
                                case Crystal:
                                    aPower = 5;
                                    break;
                                case Storm:
                                    aPower = 7;
                                    break;
                                case Ultimate:
                                    aPower = 9;
                                    break;
                            }

                            switch (weapon.getType()) {
                                case Spear:
                                    tPower = 7;
                                    break;
                                case Sword:
                                    tPower = 3;
                                    break;
                                case Greatsword:
                                    tPower = 8;
                                    break;
                                case Hammer:
                                    tPower = 6;
                                    break;
                                case Bow:
                                    tPower = 4;
                                    break;
                            }
                            weaponPower = aPower + tPower;
                            weapon.setWeaponPower(weaponPower);

                            Hero warrior = new Warrior(name, "image", heroHealth, heroPower, shield, weapon);
                            heroes[index] = warrior;
                            index =+ 1;
                            System.out.println("Warrior " + warrior.toString());
                            System.out.println();

                        } else if (path == 2) {

                            System.out.println("You have chosen the path of the Mage !");
                            System.out.println();

                            int heroHealth = (int) (Math.random() * (6 - 3) + 3);
                            int heroPower = (int) (Math.random() * (15 - 8) + 8);

                            Spell spell = new Spell(SpellAttribute.random(), SpellType.random());
                            Philtre philtre = new Philtre(PhiltreRank.random());

                            int sPower = 0;
                            int spPower = 0;
                            int spellPower;

                            switch (spell.getAttribute()) {
                                case Fire:
                                    sPower = 4;
                                    break;
                                case Ice:
                                    sPower = 3;
                                    break;
                                case Lightning:
                                    sPower = 5;
                                    break;
                                case Dark:
                                    sPower = 7;
                                    break;
                                case Ultimate:
                                    sPower = 9;
                                    break;
                            }

                            switch (spell.getType()) {
                                case Ball:
                                    spPower = 3;
                                    break;
                                case Beam:
                                    spPower = 6;
                                    break;
                                case Lance:
                                    spPower = 5;
                                    break;
                                case Meteor:
                                    spPower = 8;
                                    break;
                                case Wall:
                                    spPower = 7;
                                    break;
                            }
                            spellPower = sPower + spPower;
                            spell.setSpellPower(spellPower);

                            Hero mage = new Mage(name, "image", heroHealth, heroPower, philtre, spell);
                            heroes[index] = mage;
                            index =+ 1;
                            System.out.println("Mage " + mage.toString());
                            System.out.println();
                        }

                        boolean error = true;
                        while (error) {

                            Scanner again = new Scanner(System.in);
                            System.out.println("Would you like to create another Hero? yes/no");
                            String answer = again.nextLine();
                            System.out.println();

                            if (answer.equals("yes")) {
                                create = true;
                                error = false;
                            } else if (answer.equals("no")) {
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
                    System.out.println("You choose to see your Heroes!");
                    System.out.println();

                    for (int i = 0; i < heroes.length; i++) {
                        System.out.println(i + ". " + heroes[i].toString());
                        System.out.println();
                    }
                    break;

                case 3:


                    boolean edit = true;
                    while (edit) {

                        if (heroes.length == 0) {
                            System.out.println("You have no Heroes! Go make some~");
                            edit = false;
                        } else {

                            System.out.println("Select your Hero!");
                            System.out.println();

                            for (int i = 0; i < heroes.length; i++) {
                                System.out.println(i + ". " + heroes[i]);
                                System.out.println();
                            }

                            Scanner selectHero = new Scanner(System.in);
                            System.out.println("Enter the number of your Hero : ");
                            int selected = selectHero.nextInt();
                            System.out.println();

                            boolean editHero = true;
                            while (editHero) {

                                System.out.println(heroes[selected]);
                                System.out.println();

                                Scanner editChoice = new Scanner(System.in);
                                System.out.println("What would you like to do ?\n" +
                                        "1. Change your name\n" +
                                        "2. Change your equipments\n" +
                                        "3. Delete your Hero\n" +
                                        "4. Back to Hero selection\n" +
                                        "5. Back to main menu");
                                int editAnswer = editChoice.nextInt();
                                System.out.println();

                                switch (editAnswer) {
                                    case 1:
                                        Scanner newNameInput = new Scanner(System.in);
                                        System.out.println("Enter your new name : ");
                                        String newName = newNameInput.nextLine();
                                        heroes[selected].setName(newName);
                                        System.out.println("Your new name is " + newName);
                                        System.out.println();
                                        break;

                                    case 2:
                                        break;

                                    case 3:
                                        break;

                                    case 4:
                                        editHero = false;
                                        break;

                                    case 5:
                                        editHero = false;
                                        edit = false;
                                        break;

                                    default:
                                        System.out.println("Error! Please choose one of the option available!");
                                        break;
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    game = false;
                    break;

                default:
                    System.out.println("Error! Please choose one of the option available!");
                    System.out.println();
            }
        }
    }

}
