public class Weapon {

    private final WeaponAttribute attribute;
    private final WeaponType type;
    private static int WeaponPower;

    public Weapon(WeaponAttribute wAttribute, WeaponType wType) {
        this.attribute = wAttribute;
        this.type = wType;
    }

    public String description() {
        return attribute + " " + type + " : Atk Power " + WeaponPower;
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponAttribute.random(), WeaponType.random());

        int aPower = 0;
        int tPower = 0;

        switch (weapon.attribute) {
            case Burning:
                aPower = 3;
                break;
            case Frost:
                aPower = 2;
                break;
            case Crystal:
                aPower = 5;
                break;
            case Storm:
                aPower = 7;
                break;
            case Ultimate:
                aPower = 9;
                break;
        }

        switch (weapon.type) {
            case Spear:
                tPower = 7;
                break;
            case Sword:
                tPower = 3;
                break;
            case Greatsword:
                tPower = 8;
                break;
            case Gun:
                tPower = 6;
                break;
            case Bow:
                tPower = 4;
                break;
        }

        WeaponPower = aPower + tPower;
        System.out.println(weapon.description());

    }

}