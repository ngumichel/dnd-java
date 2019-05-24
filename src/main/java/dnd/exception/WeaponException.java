package dnd.exception;

public class WeaponException extends Exception {
    public WeaponException() {
        System.out.println("Can't set weapon manually, use genOffense instead !");
    }
}
