package tcpFileExchange;

import sensordata.Data;
import sensordata.DataExchanger;
import sensordata.ReceiveData;
import sensordata.SendData;
import tcp.ConnectToSocket;
import tcp.Connection;
import tcp.Connector;
import tcp.OpenConnection;

import java.io.IOException;

public class TCPSensorDataExchangerImpl implements TCPSensorDataExchanger{
    @Override
    public void sendSensorData(Data data, String hostname, int port) throws IOException {
        ConnectToSocket client = new Connector();
        Connection connection = client.connectToSocket(port, hostname);

        SendData sensorData = new DataExchanger();
        sensorData.senddata(data, connection.getoutputstream());
    }

    @Override
    public Data receiveSensorData(int port) throws IOException {
        OpenConnection server = new Connector();
        Connection connection = server.acceptsocket(port);

        ReceiveData receiver = new DataExchanger();
        Data data = receiver.recieveData(connection.getinputstream());

        return data;
    }
}
