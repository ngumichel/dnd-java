public class Spell {

    private final SpellAttribute attribute;
    private final SpellType type;

    public Spell(SpellAttribute sAttribute, SpellType sType) {
        this.attribute = sAttribute;
        this.type = sType;
    }

    public String description() {
        return attribute + " " + type;
    }

    public static void main(String[] args) {
        Spell spell = new Spell(SpellAttribute.random() , SpellType.random());
        System.out.println( spell.description());
    }

}
