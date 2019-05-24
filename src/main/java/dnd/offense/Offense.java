package dnd.offense;

public abstract class Offense {

    private String attribute;
    private String type;
    private int power;

    public Offense() {

    }

    public Offense(String attribute, String type, int power) {
        this.attribute = attribute;
        this.type = type;
        this.power = power;
    }

    public String description() {
        return attribute + " " + type + " (AP " + power + ")";
    }

}
