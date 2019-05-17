import java.util.Random;

public enum SpellAttribute {
    Fire ("Fire"),
    Ice ("Ice"),
    Lightning ("Lightning"),
    Dark ("Dark"),
    Ultimate ("Ultimate");

    private String name = "";

    SpellAttribute(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public static SpellAttribute random() {
        SpellAttribute[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
