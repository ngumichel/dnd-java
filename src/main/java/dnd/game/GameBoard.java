package dnd.game;

import dnd.event.GameEvent;
import dnd.event.Item;
import dnd.event.ItemEvent;
import dnd.hero.Hero;

import java.util.ArrayList;

public class GameBoard {

    ArrayList<GameCell> gameCellsList;

    public GameBoard() {
        this.gameCellsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            gameCellsList.add(new GameCell(GameEvent.random()));
        }
    }

    public GameBoard(ArrayList<GameCell> gameCells) {

    }

    public ArrayList<GameCell> getGameCellsList() {
        return gameCellsList;
    }
}
