import dnd.hero.Hero;
import dnd.hero.Mage;
import dnd.hero.Warrior;

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
        Scanner home = new Scanner(System.in);
        Status game = Status.Live;
        while (game != Status.Stop) {
            int choice = chooseAction(home);
            game = executeAction(heroes, choice);
        }
    }

    private static int chooseAction(Scanner home) {
        System.out.println("What would you like to do ?\n" +
                "______________________________________\n" +
                "1. Create a new Hero\n" +
                "2. See the list of Heroes\n" +
                "3. Edit a Hero\n" +
                "4. End Game");
        int choice;
        try {
            choice = home.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            choice = 0;
            System.out.println("Error! Please enter a digit number!");
            System.out.println();
        }
        home.nextLine();
        return choice;
    }

    private enum Status {
        Live,
        Stop;
    }

    private static Status executeAction(ArrayList<Hero> heroes, int choice) {
        switch (choice) {
            case 1:
                createHero(heroes);
                return Status.Live;
            case 2:
                listHeroes(heroes);
                return Status.Live;
            case 3:
                editHero(heroes);
                return Status.Live;
            case 4:
                return Status.Stop;
            default:
                System.out.println("Error! Please select one of the available option!");
                System.out.println();
                return Status.Live;
        }
    }

    private static void createHero(ArrayList<Hero> heroes) {
        System.out.println("You choose to create a new Hero!");
        System.out.println();

        boolean create = true;
        while (create) {

            Scanner nameScan = new Scanner(System.in);
            String name = chooseName(nameScan);
            System.out.println();

            Scanner pathScan = new Scanner(System.in);
            int path = choosePath(pathScan);
            System.out.println();


            if (path == 1) {
                createWarrior(heroes, name);
                System.out.println();

            } else if (path == 2) {
                createMage(heroes, name);
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
        return;
    }

    private static String chooseName(Scanner nameScan) {
        System.out.println("Choose a name for your hero :");
        String name = nameScan.nextLine();
        System.out.println("Your name is : " + name + " !");
        return name;
    }

    private static int choosePath(Scanner pathScan) {
        System.out.println("Choose your path :\n" +
                "______________________________________\n" +
                "1. Path of Power\n" +
                "2. Path of Wisdom");
        return pathScan.nextInt();
    }

    private static void createMage(ArrayList<Hero> heroes, String name) {
        System.out.println("You have chosen the path of the Mage !");
        System.out.println();

        int heroHealth = (int) (Math.random() * (6 - 3) + 3);
        int heroPower = (int) (Math.random() * (15 - 8) + 8);

        Hero mage = new Mage(name, "image", heroHealth, heroPower);
        heroes.add(mage);

        System.out.println(mage.toString());
    }

    private static void createWarrior(ArrayList<Hero> heroes, String name) {
        System.out.println("You have chosen the path of the Warrior !");
        System.out.println();

        int heroHealth = (int) (Math.random() * (10 - 5) + 5);
        int heroPower = (int) (Math.random() * (10 - 5) + 5);

        Hero warrior = new Warrior(name, "image", heroHealth, heroPower);
        heroes.add(warrior);

        System.out.println(warrior.toString());
    }

    private static void listHeroes(ArrayList<Hero> heroes) {
        if (heroes.size() == 0) {
            System.out.println("You have no Heroes! Go make some~");
            System.out.println();
        } else {
            System.out.println("You choose to see your Heroes!");
            System.out.println();

            for (int i = 0; i < heroes.size(); i++) {
                Hero hero = heroes.get(i);
                System.out.println(i + ". " + heroes.get(i));
                System.out.println();
            }
        }
    }

    private static void editHero(ArrayList<Hero> heroes) {
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

                            System.out.println("Selected : " + heroes.get(selected));
                            System.out.println();

                            Scanner editChoice = new Scanner(System.in);
                            editAnswer = chooseEditAction(editChoice);

                            switch (editAnswer) {
                                case 1:
                                    changeName(heroes, selected);
                                    System.out.println();
                                    break;

                                case 2:
                                    changeEquipment(heroes, selected);
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
        return;
    }

    private static void changeEquipment(ArrayList<Hero> heroes, int selected) {
        Hero hero = heroes.get(selected);
        hero.genOffense();
        hero.genDefense();
    }

    private static void changeName(ArrayList<Hero> heroes, int selected) {
        Scanner newNameInput = new Scanner(System.in);
        System.out.println("Enter your new name : ");
        String newName = newNameInput.nextLine();
        heroes.get(selected).setName(newName);
        System.out.println("Your new name is " + newName);
    }

    private static int chooseEditAction(Scanner editChoice) {
        int editAnswer;
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
        return editAnswer;
    }

}