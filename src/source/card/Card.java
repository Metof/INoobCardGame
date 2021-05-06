package source.card;

import java.awt.*;

public abstract class Card {
    private Type type;
    private String text;

    public Card(Type type, String text){
        this.type = type;
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public Type getType(){
       return this.type;
    }
}
