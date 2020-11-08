package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connector implements  ConnectToSocket, OpenConnection, Connection {
    private Socket socket;
    @Override
    public Connection connctetosocket(int portnumb, String servername) throws IOException {
        this.socket = new Socket(servername, portnumb);
        return this;
    }

    @Override
    public Connection acceptsocket(int portnumb) throws IOException {
        ServerSocket server = new ServerSocket(portnumb);
        this.socket = server.accept();
        System.out.println("Socket created");
        return this;
    }
    @Override
    public OutputStream getoutputstream() throws IOException {
        return this.socket.getOutputStream();
    }
    @Override
    public InputStream getinputstream() throws IOException {
        return this.socket.getInputStream();
    }

}
