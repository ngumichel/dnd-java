import java.util.Random;

public enum SpellAttribute {
    Fire(4),
    Ice(3),
    Lightning(5),
    Dark(7),
    Ultimate(9);

    private int saPower;

    SpellAttribute(int power) {
        this.saPower = power;
    }

    public int getSaPower() {
        return saPower;
    }

    public static SpellAttribute random() {
        SpellAttribute[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
