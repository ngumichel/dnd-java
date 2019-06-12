package dnd.event;

import java.util.Random;

public enum Item {
    Item1,
    Item2,
    Item3,
    Item4,
    Item5;

    public static Item random() {
        Item[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
