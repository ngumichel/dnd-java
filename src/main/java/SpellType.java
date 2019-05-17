import java.util.Random;

public enum SpellType {
    Ball ("Ball"),
    Lance ("Lance"),
    Beam ("Beam"),
    Meteor ("Meteor"),
    Wall ("Wall");

    private String name = "";

    SpellType(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public static SpellType random() {
        SpellType[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
