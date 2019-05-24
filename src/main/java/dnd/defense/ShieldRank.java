package dnd.defense;

import java.util.Random;

public enum ShieldRank {
    Wood("Wood"),
    Iron("Iron"),
    Gold("Gold"),
    Platinum("Platinum"),
    Diamond("Diamond");

    private String srName;

    ShieldRank(String name) {
        this.srName = name;
    }

    public String getSrName() {
        return srName;
    }

    public static ShieldRank random() {
        ShieldRank[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}