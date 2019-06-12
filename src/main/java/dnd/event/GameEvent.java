package dnd.event;

import java.util.Random;

public abstract class GameEvent {

    public GameEvent() {

    }

    public String description() {
        return "";
    }

    public static GameEvent random () {
        GameEvent[] values = {new ItemEvent(Item.random()), new EnemyEvent(Enemy.random()), new NoEvent(Nothing.random())};
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
