package dnd.weapon;

import java.util.Random;

public enum WeaponAttribute {
    Burning("Blazing", 3),
    Frost("Frost", 2),
    Crystal("Crystal", 5),
    Storm("Storm", 7),
    Ultimate("Ultimate", 9);

    private String waName;
    private int waPower;

    WeaponAttribute(String name, int power) {
        this.waName = name;
        this.waPower = power;
    }

    public String getWaName() {
        return waName;
    }

    public int getWaPower() {
        return waPower;
    }

    public static WeaponAttribute random() {
        WeaponAttribute[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}