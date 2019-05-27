package dnd.game;

import dnd.event.GameEvent;
import dnd.hero.Hero;

import java.util.ArrayList;

public class GameBoard {

    private int cellNumber;
    private ArrayList<GameEvent> geList;

    public GameBoard() {

    }

    public GameBoard(Hero firstPlayer) {
        this.geList = new ArrayList<>();
        this.cellNumber = 25;
    }

    public GameBoard(Hero firstPlayer, Hero secondPlayer) {

    }

    public GameBoard(Hero firstPlayer, Hero secondPlayer, Hero thirdPlayer) {

    }

    public GameBoard(Hero firstPlayer, Hero secondPlayer, Hero thirdPlayer, Hero fourthPlayer) {

    }

}
