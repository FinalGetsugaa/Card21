package Final.Getsugaa;

public class Game {


    public static void main(String[] args) {

        //==Create a Deck==//
        Deck d1 = new Deck();
        d1.populate();
        d1.shuffle();

        //==Create Playing Hands==//
        Hand h1,h2,h3,dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();
        Hand[] hand = {h1,h2,h3};


        //==Deal cards to hands==//
        d1.deal(hand,2);

        //==Deal Cards to Dealer==//
        d1.deal(dealer,2);


        //==Show Players Hand==//
        for(int i=0;i<hand.length;i++){
            hand[i].flipCards();
            System.out.println(hand[i].showHand());
        }

        //==Flip Dealer's first Card==//
        dealer.cards.get(0).flipCard();
        dealer.cards.get(1).flipCard();

        //Show Dealer Cards
        System.out.println(dealer.showHand());
    }
}
