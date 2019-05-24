package dnd.spell;

public class Spell {

    private String attribute;
    private String type;
    private int SpellPower;

    public Spell() {

    }

    public Spell(String sAttribute, String sType, int sPower) {
        this.attribute = sAttribute;
        this.type = sType;
        this.SpellPower = sPower;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public String getType() {
        return this.type;
    }

    public int getSpellPower() {
        return this.SpellPower;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpellPower(int spellPower) {
        this.SpellPower = spellPower;
    }

    public String description() {
        return attribute + " " + type + " (AP " + SpellPower + ")";
    }

}