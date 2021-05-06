package source.card;

import javax.swing.*;

public class CardPanel extends JPanel {
    public Card c;

    public CardPanel(Card card){
        this.c = card;
    }

    public void writeText(){
        JLabel jl = new JLabel(c.getText());
        this.add(jl);
    }

    public void serBackgroundColor(){
        this.setBackground(c.getType().color);
    }
}
