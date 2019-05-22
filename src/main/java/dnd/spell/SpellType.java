package dnd.spell;

import java.util.Random;

public enum SpellType {
    Ball(3),
    Beam(6),
    Lance(5),
    Meteor(8),
    Wall(7);

    private int stPower;

    SpellType(int power) {
        this.stPower = power;
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
