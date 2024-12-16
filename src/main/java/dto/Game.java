package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Game {

    private int round;

    private List<Player> players;

    private List<Card> cards;

    public void gameStart() {
    }
}
