package dnd.offense;

import java.util.Random;

public enum WeaponType {
    Spear("Spear", 7),
    Sword("Sword", 3),
    Greatsword("Greatsword", 8),
    Hammer("Hammer", 6),
    Bow("Bow", 4);

    private String wtName;
    private int wtPower;

    WeaponType(String name, int power) {
        this.wtName = name;
        this.wtPower = power;
    }

    public String getWtName() {
        return wtName;
    }

    public int getWtPower() {
        return wtPower;
    }

    public static WeaponType random() {
        WeaponType[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}