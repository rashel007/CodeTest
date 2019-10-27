package Task3;

/**
 * VideoPlayer class
 * Singleton Pattern Used, so that only one instance of this class created
 */
public enum VideoPlayer {
    INSTANCE;

    public void play() {
        System.out.println("Playing...");
    }

    public void forward() {
        System.out.println("Forwarding...");
    }

    public void rewind() {
        System.out.println("Rewinding...");
    }
}
