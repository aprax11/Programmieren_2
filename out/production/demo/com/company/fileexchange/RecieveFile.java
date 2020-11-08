package fileexchange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface RecieveFile {
    /**
     * receves file saves it in an new file
     * @param filname   name of the new file
     * @param is   InputStream
     */
    void receveFile(String filname, InputStream is) throws IOException;
}
