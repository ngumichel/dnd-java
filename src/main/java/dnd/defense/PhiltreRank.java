package dnd.defense;

import java.util.Random;

public enum PhiltreRank {
    Azure("Azure"),
    Crimson("Crimson"),
    Emerald("Emerald"),
    Black("Black"),
    White("White");

    private String prName;

    PhiltreRank(String name) {
        this.prName = name;
    }

    public String getPrName() {
        return prName;
    }

    public static PhiltreRank random() {
        PhiltreRank[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}