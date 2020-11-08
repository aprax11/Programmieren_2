package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Connection {
    /**
     *
     * @return outputstream of socket
     */
    OutputStream getoutputstream() throws IOException;

    /**
     *
     * @return inputstream of socket
     */
    InputStream getinputstream() throws IOException;
}
