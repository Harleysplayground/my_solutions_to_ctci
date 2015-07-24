import java.util.ArrayList;

class Deck implements Constvar{
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(){
	   for(int i=0; i<52; i++){
            Card card = new Card();
	        cards.add(card);
	   }
    }

    public int deckSize(){
        return cards.size();

    }

    public void printDeck(){
        for(int i=0; i<deckSize(); i++)
            System.out.println(cards.get(i).getsuit()+" "+cards.get(i).getnum());
        
	}

    public static void main(String[] args){
        Deck myHand = new Deck();
        myHand.printDeck();
    }   
}



