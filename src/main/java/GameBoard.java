import java.util.HashMap;

/**
 * Created by fshabbir on 7/8/17.
 */
public class GameBoard {
    private Integer NUM_ROWS = 3;
    private Integer NUM_COLS = 4;
    private Integer DEFAULT_GOLD_GEM_COUNT = 5;
    private Integer DEFAULT_GEM_COUNT = 7;
    private Card[][] cardState = new Card[NUM_ROWS][NUM_COLS];
    private HashMap<GemColor, Integer> bank = new HashMap<GemColor, Integer>(GemColor.values().length);

    private Card[][] loadCards(Card[][] cardState) {
        // load cards from file and randomize each row
        return cardState;
    }

    private void initializeBank(Integer numPlayers) {
        this.bank.put(GemColor.GOLD, DEFAULT_GOLD_GEM_COUNT);
        for (GemColor color: GemColor.values()){
            if(!color.equals(GemColor.GOLD)){
                int takeAwayGemCount = 0;
                if (numPlayers == 2) {
                    takeAwayGemCount = 3;
                } else if (numPlayers == 3){
                    takeAwayGemCount = 2;
                }
                this.bank.put(color, DEFAULT_GEM_COUNT - takeAwayGemCount);
            }
        }
    }
}
