package sensordata;

import java.io.IOException;
import java.io.InputStream;

public interface RecieveData {
    /**
     * recieve the semsordata
     * @param is    the inputstream
     */
    void recieveData(InputStream is) throws IOException;
}
