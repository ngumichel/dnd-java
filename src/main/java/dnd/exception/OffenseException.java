package dnd.exception;

public class OffenseException extends Exception {
    public OffenseException() {
        System.out.println("Can't set offense manually, use genOffense instead !");
    }
}
