package Task3;

public class ActionRewind implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionRewind(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
