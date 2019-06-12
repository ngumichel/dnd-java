package dnd.event;

import java.util.Random;

public enum Enemy {
    Monster1,
    Monster2,
    Monster3,
    Monster4,
    Monster5;

    public static Enemy random() {
        Enemy[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
