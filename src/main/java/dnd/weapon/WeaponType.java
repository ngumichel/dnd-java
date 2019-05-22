package dnd.weapon;

import java.util.Random;

public enum WeaponType {
    Spear(7),
    Sword(3),
    Greatsword(8),
    Hammer(6),
    Bow(4);

    private int wtPower;

    WeaponType(int power) {
        this.wtPower = power;
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