import java.util.Random;

public enum ShieldRank {
    Wood,
    Iron,
    Gold,
    Platinum,
    Diamond;

    public static ShieldRank random() {
        ShieldRank[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
