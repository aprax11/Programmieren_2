package fileexchange;

import java.io.*;

public interface SendFile {
    /**
     * reads a file writs it in an Outputstream
     * @param filename name of the file that should be scanned
     * @param os FileInputStream
     */
    void sendFile(String filename, OutputStream os) throws IOException;
}
