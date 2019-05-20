public class Spell {

    private SpellAttribute attribute;
    private SpellType type;
    private int SpellPower;

    public Spell() {

    }

    public Spell(SpellAttribute sAttribute, SpellType sType) {
        this.attribute = sAttribute;
        this.type = sType;
    }

    public SpellAttribute getAttribute() {
        return this.attribute;
    }

    public SpellType getType() {
        return this.type;
    }

    public int getSpellPower() {
        return this.SpellPower;
    }

    public void setAttribute(SpellAttribute attribute) {
        this.attribute = attribute;
    }

    public void setType(SpellType type) {
        this.type = type;
    }

    public void setSpellPower(int spellPower) {
        this.SpellPower = spellPower;
    }

    public String description() {
        return attribute + " " + type + " (AP " + SpellPower + ")";
    }

}
