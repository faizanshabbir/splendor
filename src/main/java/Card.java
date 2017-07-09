import java.util.HashMap;

/**
 * Created by fshabbir on 7/8/17.
 */
public class Card {
    private HashMap<GemColor, Integer> cost = new HashMap<GemColor, Integer>(GemColor.values().length);
    private GemColor gemColor = null;
    private Integer points = null;

    public void Card(GemColor color, Integer points) {
        this.gemColor = color;
        this.points = points;
    }
}
