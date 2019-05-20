public class Spell {

    private final SpellAttribute attribute;
    private final SpellType type;
    private static int SpellPower;

    public Spell(SpellAttribute sAttribute, SpellType sType) {
        this.attribute = sAttribute;
        this.type = sType;
    }

    public String description() {
        return attribute + " " + type + " : Atk Power " + SpellPower;
    }

    public static void main(String[] args) {
        Spell spell = new Spell(SpellAttribute.random(), SpellType.random());

        int sPower = 0;
        int tPower = 0;

        switch (spell.attribute) {
            case Fire:
                sPower = 4;
                break;
            case Ice:
                sPower = 3;
                break;
            case Lightning:
                sPower = 5;
                break;
            case Dark:
                sPower = 7;
                break;
            case Ultimate:
                sPower = 9;
                break;
        }

        switch (spell.type) {
            case Ball:
                tPower = 3;
                break;
            case Beam:
                tPower = 6;
                break;
            case Lance:
                tPower = 5;
                break;
            case Meteor:
                tPower = 8;
                break;
            case Wall:
                tPower = 7;
                break;
        }

        SpellPower = sPower + tPower;
        System.out.println(spell.description());
    }

}
