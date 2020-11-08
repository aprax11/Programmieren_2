package tcp;

import java.io.IOException;

public interface OpenConnection {
    /**
     * opens socket on protnumb + accepts a connection
     * @param portnumb  the nuber of port
     */
    Connection acceptsocket(int portnumb) throws IOException;
}
