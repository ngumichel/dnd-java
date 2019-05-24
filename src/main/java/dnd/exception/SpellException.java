package dnd.exception;

public class SpellException extends Exception {
    public SpellException() {
        System.out.println("Can't set spell manually, use genOffense instead !");
    }
}
