package tcpFileExchange;

import sensordata.Data;

import java.io.IOException;

public interface TCPSensorDataExchanger {
    /**
     * send sensor data to a specified host
     * @param data
     * @param hostname
     * @param port
     */
    void sendSensorData(Data data, String hostname, int port) throws IOException;

    /**
     * Listen on a port and receive sensor data
     * @param port
     */
    Data receiveSensorData(int port) throws IOException;
}
