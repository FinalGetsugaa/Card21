package Final.Getsugaa;

public enum Suit {

    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String suitT;

    //==Constructor==//
    private Suit(String suitT){
        this.suitT = suitT;
    }


    public String printSuit(){
        return suitT;
    }
}
