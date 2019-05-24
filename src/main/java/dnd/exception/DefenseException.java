package dnd.exception;

public class DefenseException extends Exception {
    public DefenseException() {
        System.out.println("Can't set defense manually, use genDefense instead !");
    }
}
