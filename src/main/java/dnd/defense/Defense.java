package dnd.defense;

public abstract class Defense {

    private String rank;

    public Defense() {

    }

    public Defense(String rank) {
        this.rank = rank;
    }

    public String description() {
        return rank;
    }

}
