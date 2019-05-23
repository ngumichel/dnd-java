package dnd.shield;

public class Shield {

    private ShieldRank rank;

    public Shield() {

    }

    public Shield(ShieldRank sRank) {
        this.rank = sRank;
    }

    public ShieldRank getRank() {
        return this.rank;
    }

    public void setRank(ShieldRank rank) {
        this.rank = rank;
    }

    public String description() {
        return rank.toString();
    }

}