package tcp;

import java.io.IOException;

public interface ConnectToSocket {
    /**
     * connects to an open socket, listening on portnumb with the ip of servername
     * @param portnumb  number of port
     * @param servername    "localhost"
     */
    Connection connctetosocket(int portnumb, String servername) throws IOException;
}
