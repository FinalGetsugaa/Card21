package Final.Getsugaa;

public enum Rank {

    ACE(1,"Ace"),
    DEUCE(2,"Duece"),
    THREE(3,"Three"),
    FOUR(4,"Four"),
    FIVE(5,"Five"),SIX(6,"Six"),SEVEN(7,"Seven"),EIGHT(8,"Eight"),NINE(9,"Nine"),TEN(10,"Ten"),
    JACK(10,"Jack"),QUEEN(10,"Queen"),KING(10,"King");

    private final int rank;
    private final String rankString;
    //==Constructor==//
    private Rank(int rank,String rankString){
        this.rankString = rankString;
        this.rank = rank;
    }


    public int getRank(){
        return rank;
    }

    public String printRank(){
        return rankString;
    }
}
