package Start;

import alter_slime.TCPClient;
import alter_slime.TCPServer;
import tcpFileExchange.TCPFileExchange;
import tcpFileExchange.TCPFileExchangeImpl;

import java.io.IOException;

/**
 * UI for file transfer
 * expected parameters:
 * 1) send: file name, hostname, port
 * 2)receive: file name, port
 */
public class TCPFileExchangerUI {
    public static void main(String[] args) throws IOException {
        if(args.length < 2) {
            System.err.println("at least two arguments required");
            return;
        }

        String filename = args[0];
        String hostname = null;
        int port = -1;

        String portString = null;
        if(args.length == 3 ) {
            hostname = args[1];
            portString = args[2];
        }else if(args.length == 2) {
            portString = args[1];
        }

        port = Integer.parseInt(portString);

        TCPFileExchange tcpFileExchanger = new TCPFileExchangeImpl();
        if(hostname == null) {
            // receive
            System.out.println("Save copy file");
            tcpFileExchanger.receiveFile(filename, port);
        }else {
            System.out.println("sending file");
            tcpFileExchanger.sendFile2Host(filename, hostname, port);
        }

    }
}
