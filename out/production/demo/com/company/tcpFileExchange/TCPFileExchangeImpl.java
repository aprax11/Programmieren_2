package tcpFileExchange;

import fileexchange.Fileexchanger;
import fileexchange.RecieveFile;
import fileexchange.SendFile;
import tcp.Connection;
import tcp.Connector;

import java.io.IOException;
import java.io.OutputStream;

public class TCPFileExchangeImpl implements TCPFileExchange {
    @Override
    public void connect2Host(String filename, String hostname, int port) throws IOException {
        //connects
        Connection connection = new Connector();
        ((Connector) connection).connctetosocket(port, hostname);

        //sends file
        SendFile filesender = new Fileexchanger();
        filesender.sendFile(filename, connection.getoutputstream());
    }

    @Override
    public void acceptConnection(String filename, int port) throws IOException {
        //opens connection
        Connection connection = new Connector();
        ((Connector) connection).acceptsocket(port);

        //recievs file
        RecieveFile recieveFile = new Fileexchanger();
        recieveFile.receveFile(filename, connection.getinputstream());
    }
}
