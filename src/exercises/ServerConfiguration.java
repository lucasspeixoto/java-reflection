package exercises;

import java.net.InetSocketAddress;

/*
 * Singleton and Immutable
 */
public class ServerConfiguration {

    private static ServerConfiguration serverConfigurationInstance;

    private final InetSocketAddress serverAddress;

    private final String greetingMessage;

    private ServerConfiguration(int port, String greetingMessage) {
        this.greetingMessage = greetingMessage;
        this.serverAddress = new InetSocketAddress("localhost", port);

        if(serverConfigurationInstance == null) {
            serverConfigurationInstance = this;
        }
    }

    // Return current singleton instance
    public static ServerConfiguration getInstance() {
        return serverConfigurationInstance;
    }

    public InetSocketAddress getServerAddress() {
        return serverAddress;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }
}
