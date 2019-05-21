import java.util.Random;

public enum PhiltreRank {
    Azure,
    Crimson,
    Emerald,
    Black,
    White;

    public static PhiltreRank random() {
        PhiltreRank[] values = values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

}
