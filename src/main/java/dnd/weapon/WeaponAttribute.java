package dnd.weapon;

import java.util.Random;

public enum WeaponAttribute {
    Burning(3),
    Frost(2),
    Crystal(5),
    Storm(7),
    Ultimate(9);

    private int waPower;

    WeaponAttribute(int power) {
        this.waPower = power;
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