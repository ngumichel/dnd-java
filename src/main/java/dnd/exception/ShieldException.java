package dnd.exception;

public class ShieldException extends Exception {
    public ShieldException() {
        System.out.println("Can't set shield manually, use genDefense instead !");
    }
}
