public class Card {
    // PROPERTIES
    private boolean color;
    private int rank;
    private String symbol;

    // CONSTRUCTORS
    public Card() {
        this.setColor(false);
        this.setRank(0);
        this.setSymbol(1);
    }

    public Card(boolean color, int rank, int symbol) {
        this.setColor(color);
        this.setRank(rank);
        this.setSymbol(symbol);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        switch(symbol) {
            case 1:
                this.symbol = "\u0003";
                break;
            case 2:
                this.symbol = "\u0004";
                break;
            case 3:
                this.symbol = "\u0005";
                break;
            case 4:
                this.symbol = "\u0006";
                break;
            default:
                this.symbol = "\u0003";
                break;
        }
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    // METHODS
    public String toString() {
        return (this.color ? "Red " : "Black ") + this.rank + " " + this.symbol + " \n";
    }
}
