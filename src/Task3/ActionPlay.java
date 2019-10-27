package Task3;

public class ActionPlay implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionPlay(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
