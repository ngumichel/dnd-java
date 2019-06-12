import dnd.game.GameBoard;
import dnd.game.GameCell;
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

    /**
     * Menu principal du jeu :
     * 1. créer un plateau de jeu
     * 2. créer un nouveau Hero, createHero()
     * 3. afficher la liste des Hero, listHeroes()
     * 4. éditer un Hero, editHero()
     * 5. met fin au jeu
     *
     * @param home, input du choix de l'utilisateur
     *
     * @return le choix de l'utilisateur
     */
    private static int chooseAction(Scanner home) {
        System.out.println("What would you like to do ?\n" +
                "______________________________________\n" +
                "1. Play Game\n" +
                "2. Create a new Hero\n" +
                "3. See the list of Heroes\n" +
                "4. Edit a Hero\n" +
                "5. End Game");
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

    /**
     * Méthode qui éxecute le choix de l'utilisateur
     *
     * @param heroes, tableau contenant les Hero
     * @param choice, choix de l'utilisateur
     * @return le Status du jeu, Live ou Stop
     */
    private static Status executeAction(ArrayList<Hero> heroes, int choice) {
        switch (choice) {
            case 1:
                GameBoard newBoard = new GameBoard();

                for (int i = 0; i<newBoard.getGameCellsList().size(); i++) {
                    System.out.println(newBoard.getGameCellsList().get(i).description());
                }

                return Status.Live;
            case 2:
                createHero(heroes);
                return Status.Live;
            case 3:
                listHeroes(heroes);
                return Status.Live;
            case 4:
                editHero(heroes);
                return Status.Live;
            case 5:
                return Status.Stop;
            default:
                System.out.println("Error! Please select one of the available option!");
                System.out.println();
                return Status.Live;
        }
    }

    /**
     * Méthode pour créer un Hero avec le choix du nom et de la classe.
     * @see chooseName()
     * @see choosePath()
     * @see createMage()
     * @see createWarrior()
     *
     * Option pour continuer de créer un Hero en boucle si l'utilisateur le souhaite.
     *
     * @param heroes, liste des Hero qui servira a stocker les Hero
     */
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

            Hero hero = null;
            if (path == 1) {
                hero = createWarrior(name);
                System.out.println();

            } else if (path == 2) {
                hero = createMage(name);
                System.out.println();
            }

            heroes.add(hero);

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

    /**
     * Méthode pour créer le nom du Hero
     *
     * @param nameScan, input du nom de l'Hero
     * @return le nom du Hero
     */
    private static String chooseName(Scanner nameScan) {
        System.out.println("Choose a name for your hero :");
        String name = nameScan.nextLine();
        System.out.println("Your name is : " + name + " !");
        return name;
    }

    /**
     * Méthode pour choisir la classe du Hero
     * 1. Classe Warrior
     * 2. Classe Mage
     *
     * @param pathScan, input du choix de la classe
     * @returnle choix de la classe
     */
    private static int choosePath(Scanner pathScan) {
        System.out.println("Choose your path :\n" +
                "______________________________________\n" +
                "1. Path of Power\n" +
                "2. Path of Wisdom");
        return pathScan.nextInt();
    }

    /**
     * Méthode pour créer la classe Mage
     * Génère aléatoirement la vie et la puissance du Mage selon les attributs de sa classe
     *
     * @param name, le nom du Mage
     * @return le Mage
     */
    private static Hero createMage(String name) {
        System.out.println("You have chosen the path of the Mage !");
        System.out.println();

        int heroHealth = (int) (Math.random() * (6 - 3) + 3);
        int heroPower = (int) (Math.random() * (15 - 8) + 8);

        Hero mage = new Mage(name, "image", heroHealth, heroPower);

        System.out.println(mage.toString());
        return mage;
    }

    /**
     * Méthode pour créer la classe Warrior
     * Génère aléatoirement la vie et la puissance du Warrior selon les attributs de sa classe
     *
     * @param name, le nom du Warrior
     * @return le Warrior
     */
    private static Hero createWarrior(String name) {
        System.out.println("You have chosen the path of the Warrior !");
        System.out.println();

        int heroHealth = (int) (Math.random() * (10 - 5) + 5);
        int heroPower = (int) (Math.random() * (10 - 5) + 5);

        Hero warrior = new Warrior(name, "image", heroHealth, heroPower);

        System.out.println(warrior.toString());
        return warrior;
    }

    /**
     * Méthode pour afficher la liste des Hero
     *
     * @param heroes, liste des Hero
     */
    private static void listHeroes(ArrayList<Hero> heroes) {
        if (heroes.size() == 0) {
            System.out.println("You have no Heroes! Go make some~");
            System.out.println();
        } else {
            System.out.println("You choose to see your Heroes!");
            System.out.println();

            for (int i = 0; i < heroes.size(); i++) {
                Hero hero = heroes.get(i);
                System.out.println(i + ". " + hero);
                System.out.println();
            }
            /*for(Hero hero : heroes) {
                System.out.println(hero);
            }*/
        }
    }

    /**
     *Méthode pour éditer un Hero, propose plusieurs option d'édition
     * @see chooseEditAction()
     *
     * @param heroes, liste des Hero
     */
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
    }

    /**
     * Menu d'édition du Hero
     * 1. changer le nom du Hero
     * 2. changer les équipements du Hero
     * 3. supprimer le Hero
     * 4. revenir à la séléction des Hero
     * 5. revenir au menu principal du jeu
     *
     * @param editChoice, input de séléction du menu
     * @return le choix de séléction de l'utilisateur
     */
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

    /**
     * Méthode pour changer le nom du Hero avec une nouvelle saisie scanner
     *
     * @param heroes, la liste des Hero
     * @param selected, le Hero séléctionner
     */
    private static void changeName(ArrayList<Hero> heroes, int selected) {
        Scanner newNameInput = new Scanner(System.in);
        System.out.println("Enter your new name : ");
        String newName = newNameInput.nextLine();
        heroes.get(selected).setName(newName);
        System.out.println("Your new name is " + newName);
    }

    /**
     * Méthode pour changer les équipements du Hero avec une nouvelle génération aléatoire
     * @see genOffense()
     * @see genDefense()
     *
     * @param heroes
     * @param selected
     */
    private static void changeEquipment(ArrayList<Hero> heroes, int selected) {
        Hero hero = heroes.get(selected);
        hero.genOffense();
        hero.genDefense();
    }





}