import java.util.Random;

public enum WeaponAttribute {
    Burning ("Burning"),
    Frost ("Frost"),
    Crystal ("Crystal"),
    Storm ("Storm"),
    Ultimate ("Ultimate");

    private String name = "";

    WeaponAttribute(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public static WeaponAttribute random() {
        WeaponAttribute[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}