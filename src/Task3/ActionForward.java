package Task3;

public class ActionForward implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionForward(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.forward();
    }
}
