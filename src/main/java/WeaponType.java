import java.util.Random;

public enum WeaponType {
    Spear ("Spear"),
    Sword ("Sword"),
    Greatsword ("Greatsword"),
    Gun ("Gun"),
    Bow ("Bow");

    private String name = "";

    WeaponType(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public static WeaponType random() {
        WeaponType[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
