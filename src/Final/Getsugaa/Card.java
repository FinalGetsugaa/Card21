package Final.Getsugaa;

public class Card {

    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;

    //==Constructor==//

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceUp = true;
    }

    public String getSuit(){
        return suit.printSuit();
    }

    public int getRank(){
        return rank.getRank();
    }

    public String printRank(){
        return rank.printRank();
    }

    public void flipCard(){
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        return isFaceUp ? "" +
                "" + rank.printRank() +
                "of " + suit.printSuit() : "Face Down (Nothing to see here Fella)";
    }
}
