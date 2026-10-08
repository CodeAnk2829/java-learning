package connectfour;

import connectfour.utils.DiscColor;

public class Player {
    private String name;
    private DiscColor color;
    
    Player(String name, DiscColor color) {
        this.name = name;
        this.color = color;
    }

    String getPlayerName() {
        return this.name;
    }

    DiscColor getColor() {
        return this.color;
    }
}
