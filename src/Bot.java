import javafx.scene.control.Button;

public class Bot {
    public int[] move(Button[][] map, boolean playerXTurn, int roundsLeft){
        BotController decissionMaker = new MinMax(map);
        return decissionMaker.run();
    }
}
