package fileexchange;

import java.io.*;

public class Fileexchanger implements SendFile, RecieveFile {
    @Override
    
    public void sendFile(String filename, OutputStream os) throws IOException {
        FileInputStream fis = new FileInputStream(filename);

    this.streamData(fis, os);

    }

    @Override

    public void receveFile(String filname, InputStream is) throws IOException {
        FileOutputStream fos = new FileOutputStream(filname);
      this.streamData(is, fos);
    }

    private void streamData(InputStream is, OutputStream os) throws IOException {

        int i = 0;
        do {
            i = is.read();
            if(i != -1) {
                os.write(i);
            }
        }while (i != -1);
        os.close();
    }
}
