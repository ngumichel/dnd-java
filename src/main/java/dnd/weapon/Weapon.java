package dnd.weapon;

public class Weapon {

    private String attribute;
    private String type;
    private int WeaponPower;

    public Weapon() {

    }

    public Weapon(String wAttribute, String wType, int wPower) {
        this.attribute = wAttribute;
        this.type = wType;
        this.WeaponPower = wPower;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public String getType() {
        return this.type;
    }

    public int getWeaponPower() {
        return this.WeaponPower;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeaponPower(int weaponPower) {
        this.WeaponPower = weaponPower;
    }

    public String description() {
        return attribute + " " + type + " (AP " + WeaponPower + ")";
    }

}