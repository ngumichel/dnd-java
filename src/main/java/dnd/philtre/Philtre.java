package dnd.philtre;

public class Philtre {

    private PhiltreRank rank;

    public Philtre() {

    }

    public Philtre(PhiltreRank pRank) {
        this.rank = pRank;
    }

    public PhiltreRank getRank() {
        return this.rank;
    }

    public void setRank(PhiltreRank rank) {
        this.rank = rank;
    }

    public String description() {
        return rank + "";
    }

}
