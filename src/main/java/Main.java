import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Scanner nameScan = new Scanner(System.in);
        System.out.println("Choose a name for your hero :");
        String name = nameScan.nextLine();
        System.out.println("Your name is : " + name + " !");
        System.out.println();

        Scanner pathScan = new Scanner(System.in);
        System.out.println("Choose your path :\n" + "1. Path of Power\n" + "2. Path of Wisdom");
        int path = parseInt(pathScan.nextLine());
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
            System.out.println(warrior.toString());

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
            System.out.println(mage.toString());
        }
    }

}
