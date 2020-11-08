package sensordata;

import java.io.*;

public class DataExchanger implements RecieveData, SendData {

    @Override
    public void recieveData(InputStream is) throws IOException {
        DataInputStream dis = new DataInputStream(is);

        long timestamp = dis.readLong();
        float value = dis.readFloat();
        String sensorName = dis.readUTF();
        Dataentity data = new Dataentity(timestamp, value, sensorName);
    }

    @Override
    public void senddata(Dataentity data, OutputStream os) throws IOException {
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeLong(data.gettimestamp());
        dos.writeFloat(data.getvalue());
        dos.writeUTF(data.getname());
    }
}
