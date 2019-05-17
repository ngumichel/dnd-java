public class Weapon {

    private final WeaponAttribute attribute;
    private final WeaponType type;

    public Weapon(WeaponAttribute wAttribute, WeaponType wType) {
        this.attribute = wAttribute;
        this.type = wType;
    }

    public String description() {
        return attribute + " " + type;
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponAttribute.random() , WeaponType.random());
        System.out.println( weapon.description());
    }

}
