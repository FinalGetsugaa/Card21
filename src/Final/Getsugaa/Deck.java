package Final.Getsugaa;

import java.util.Random;

public class Deck extends Hand {

    Random rand = new Random();

    public void populate() {
        for (Suit suits : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suits, rank);
                card.flipCard();
                this.add(card);
            }
        }
    }

    public void shuffle(){
        for (int i = cards.size()-1 ; i>0 ; i--){
            //==swap a random card b/w beginning and last card of loop ==//
            int pick = rand.nextInt(i);
            Card randCard = cards.get(pick);
            Card lastCard = cards.get(i);
            cards.set(i,randCard);
            cards.set(pick,lastCard);
        }
    }

    //==Deal method==//
    public void deal(Hand[] hands,int perHand){
        for(int i=0;i<perHand;i++){
            for(int j=0;j<hands.length;j++){
                this.give(cards.get(0),hands[j]);
            }
        }
    }

    //==Deal to a Single Hand==//
    public void deal(Hand hand,int perHand){
        for(int i=0;i<perHand;i++){
                this.give(cards.get(0),hand);
        }
    }

    public void flipCard(Card c){
        c.flipCard();
    }
}
