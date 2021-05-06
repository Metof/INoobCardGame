package source.card;

import java.util.LinkedList;

public abstract class Deck {
    private Type type;
    private String name;
    private LinkedList<Card> deck;

    public Deck(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public void addCard(Card card){
        if(card.getType() == this.type){
            this.deck.add(card);
        }else{
            //TODO error
        }
    }

    public static Deck codeToDeck(String deckCode, Deck deckSample){
        //todo mandare il deckCode, ovvero il testo del file rerializzato
        return null;
    }

    public Card drawCard() {
        return this.deck.remove((int)(Math.random() * this.deck.size()) + 1);
    }


}
