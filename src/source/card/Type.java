package source.card;

import java.awt.*;

public enum Type {
    White(Color.WHITE, Color.BLACK),
    Black(Color.BLACK, Color.WHITE);

    public Color color;
    public Color textColor;
    Type(Color color, Color textColor) {
        this.color = color;
        this.textColor = textColor;
    }
}
