package dnd.spell;

import java.util.Random;

public enum SpellType {
    Ball("Ball",3),
    Beam("Beam",6),
    Lance("Lance",5),
    Meteor("Meteor",8),
    Wall("Wall",7);

    private String stName;
    private int stPower;

    SpellType(String name, int power) {
        this.stName = name;
        this.stPower = power;
    }

    public String getStName() {
        return stName;
    }

    public int getStPower() {
        return stPower;
    }

    public static SpellType random() {
        SpellType[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}