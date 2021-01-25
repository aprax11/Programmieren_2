package tcpFileExchange;

import java.io.IOException;

public interface TCPFileExchange {
    /**
     * Send a file to host via TCP
     * @param filename
     * @param hostname
     * @param port
     */
    void sendFile2Host(String filename, String hostname, int port) throws IOException;

    /**
     * Receive content from a TCP client and write it in a lokal file
     * @param filename
     * @param port to accept connection
     */
    void receiveFile(String filename, int port) throws IOException;
}
