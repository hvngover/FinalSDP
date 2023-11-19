package SingletonPattern;

public class ServerStatus {
    private static class SingletonHelper {
        private static final ServerStatus INSTANCE = new ServerStatus();
    }

    private final String serverName;
    private final String serverCondition;
    private final int maxPlayers;
    private final int playersOnline;

    private ServerStatus() {
        serverName = "Aincrad";
        serverCondition = "Stable";
        maxPlayers = 10000;
        playersOnline = 1255;
    }

    public static ServerStatus getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showStatus() {
        System.out.println("SERVER STATUS" + "\n" + "Server name: " + serverName);
        System.out.println("Server condition: " + serverCondition);
        System.out.println("Max players: " + maxPlayers);
        System.out.println("Players online: " + playersOnline);
    }
}
