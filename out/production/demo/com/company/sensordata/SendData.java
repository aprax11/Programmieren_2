package sensordata;

import java.io.IOException;
import java.io.OutputStream;

public interface SendData {
    /**
     * send the semsor data
     * @param data  Data Objekt
     * @param os    Outputstream
     */
    void senddata(Dataentity data, OutputStream os) throws IOException;
}
