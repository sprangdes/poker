package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Player {

    private String playerNo;

    private String playerName;

    private List<Card> cards;

    private Integer point;

    public Player(String playerNo, String playerName) {
        this.playerNo = playerNo;
        this.playerName = playerName;
        this.point = 0;
    }
}
