package sensordata;

public interface Data {
    /**
     * The sensor data
     * @return returns the values
     */
    long gettimestamp();
    float getvalue();
    String getname();
}
