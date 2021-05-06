package source.card;

import java.awt.*;

public enum Type {
    Action(Color.WHITE, Color.BLACK),
    Character(Color.BLACK, Color.WHITE);

    public Color color;
    public Color textColor;
    Type(Color color, Color textColor) {
        this.color = color;
        this.textColor = textColor;
    }
}
