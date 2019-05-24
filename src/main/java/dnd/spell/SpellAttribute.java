package dnd.spell;

import java.util.Random;

public enum SpellAttribute {
    Fire("Fire", 4),
    Ice("Ice", 3),
    Lightning("Lightning", 5),
    Dark("Dark", 7),
    Ultimate("Ultimate", 9);

    private String saName;
    private int saPower;

    SpellAttribute(String name, int power) {
        this.saName = name;
        this.saPower = power;
    }

    public String getSaName() {
        return saName;
    }

    public int getSaPower() {
        return saPower;
    }

    public static SpellAttribute random() {
        SpellAttribute[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}