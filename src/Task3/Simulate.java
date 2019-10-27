package Task3;

public class Simulate {

    public static void main(String[] args) {

        VideoPlayer player = VideoPlayer.INSTANCE;

        ActionListenerCommand actionPlay = new ActionPlay(player);
        ActionListenerCommand actionForward = new ActionForward(player);
        ActionListenerCommand actionRewind = new ActionRewind(player);

        actionPlay.execute();
        actionForward.execute();
        actionRewind.execute();
    }
}
