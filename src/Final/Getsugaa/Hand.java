package Final.Getsugaa;

import java.util.ArrayList;

public class Hand {
    public ArrayList<Card> cards;

    //==constructor==//
    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void clear(){
        cards.clear();
    }

    public void add(Card card){
        cards.add(card);
    }
    public String showHand(){

        //==Show Total Points only if all cards are face up==//
        boolean allfaceup = true;

        String str = " ";

        for(Card c: cards){
            str += c.toString() + "\n";
            if(!c.isFaceUp){
                allfaceup = false;
            }
        }
        if(allfaceup){
            str += "Total Ponts:"+" "+getTotal()+"\n";
        }
        return str;
    }

    public int getTotal(){
        int totalpnt = 0;
        boolean hasAce = false;
        for(int i=0;i<cards.size();i++){
            totalpnt += cards.get(i).getRank();
            if(cards.get(i).printRank() == "Ace"){
                hasAce = true;
            }
            if(hasAce && totalpnt<=11){
                totalpnt += 10;
            }
        }
        return totalpnt;
    }

    public void flipCards(){
        for(Card c: cards){
            c.flipCard();
        }
    }
    public boolean give(Card card,Hand othr){

        if(!cards.contains(card)){
            return false;
        }
        else{
            // get index posn of card
            cards.remove(card);
            othr.add(card);
            return true;
        }
    }
}
