package tcpFileExchange;

import fileexchange.Fileexchanger;
import fileexchange.RecieveFile;
import fileexchange.SendFile;
import tcp.ConnectToSocket;
import tcp.Connection;
import tcp.Connector;
import tcp.OpenConnection;

import java.io.IOException;

public class TCPFileExchangeImpl implements TCPFileExchange{
    @Override
    public void sendFile2Host(String filename, String hostname, int port) throws IOException {
        // need connection
        ConnectToSocket client = new Connector();
        Connection connection = client.connectToSocket(port, hostname);

        //send file
        SendFile fileSender = new Fileexchanger();
        fileSender.sendFile(filename, connection.getoutputstream());
    }

    @Override
    public void receiveFile(String filename, int port) throws IOException {
        OpenConnection server = new Connector();
        Connection connection = server.acceptsocket(port);

        RecieveFile fileReceiver = new Fileexchanger();
        fileReceiver.recieveFile(filename, connection.getinputstream());

    }
}
