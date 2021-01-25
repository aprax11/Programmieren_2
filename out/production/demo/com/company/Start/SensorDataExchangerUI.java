package Start;

import sensordata.Data;
import sensordata.DataImpl;
import tcpFileExchange.TCPSensorDataExchanger;
import tcpFileExchange.TCPSensorDataExchangerImpl;

import java.io.IOException;

/**
 * UI for sending sensor data
 * 1) Sends the data: long timestamp, float value, String sensorname, hostname, port
 * 2) Receives the data: port
 */
public class SensorDataExchangerUI {
    public static void main(String[] args) throws IOException {
        long timestamp = 0;
        float value = 0;
        String sensorname = null;
        String hostname = null;

        int port = -1;

        TCPSensorDataExchanger sensorDataExchanger = new TCPSensorDataExchangerImpl();

       if(args.length != 5 && args.length != 1) {
           System.err.println("please check parameters");
       }else if(args.length == 5) {
           String timestampString = args[0];
           timestamp = Long.parseLong(timestampString);

           String valueString = args[1];
           value = Float.parseFloat(valueString);

           sensorname = args[2];

           Data data = new DataImpl(timestamp, value, sensorname);

           hostname = args[3];

           String portString = args[4];
           port = Integer.parseInt(portString);
           //send data
           sensorDataExchanger.sendSensorData(data, hostname, port);
       }else if(args.length == 1) {
           String portString = args[0];
           port = Integer.parseInt(portString);
           //receive data
           Data data = sensorDataExchanger.receiveSensorData(port);

           System.out.println("timestamp: "+data.gettimestamp());
           System.out.println("value: "+data.getvalue());
           System.out.println("sensor name: "+data.getname());

       }
    }

}
