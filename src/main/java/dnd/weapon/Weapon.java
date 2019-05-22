package dnd.weapon;

public class Weapon {

    private WeaponAttribute attribute;
    private WeaponType type;
    private int WeaponPower;

    public Weapon() {

    }

    public Weapon(WeaponAttribute wAttribute, WeaponType wType) {
        this.attribute = wAttribute;
        this.type = wType;
    }

    public WeaponAttribute getAttribute() {
        return this.attribute;
    }

    public WeaponType getType() {
        return this.type;
    }

    public int getWeaponPower() {
        return this.WeaponPower;
    }

    public void setAttribute(WeaponAttribute attribute) {
        this.attribute = attribute;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public void setWeaponPower(int weaponPower) {
        this.WeaponPower = weaponPower;
    }

    public String description() {
        return attribute + " " + type + " (AP " + WeaponPower + ")";
    }

}