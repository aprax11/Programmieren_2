package tcpFileExchange;

import java.io.IOException;

public interface TCPFileExchange {
    void connect2Host(String filename, String hostname, int port) throws IOException;

    void acceptConnection(String filename, int port) throws IOException;
}
