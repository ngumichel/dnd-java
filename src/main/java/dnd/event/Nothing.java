package dnd.event;

import java.util.Random;

public enum Nothing {
    Rest,
    Nap,
    Sleep;

    public static Nothing random() {
        Nothing[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
