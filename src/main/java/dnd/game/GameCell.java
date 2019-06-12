package dnd.game;

import dnd.event.GameEvent;

public class GameCell {

    private GameEvent event;

    public GameCell() {

    }

    public GameCell(GameEvent eEvent) {
        this.event = eEvent;
    }

    public String description() {
        return "Vous êtes tombé sur " + event.description();
    }

}
