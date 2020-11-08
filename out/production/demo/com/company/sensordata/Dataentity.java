package sensordata;

public class Dataentity implements Data {
    private final long timestamp;
    private final float value;
    private final String sensorname;


    Dataentity(long timestamp, float value, String sensorname) {
        this.timestamp = timestamp;
        this.value = value;
        this.sensorname = sensorname;
    }

    @Override
    public long gettimestamp() {
        return this.timestamp;
    }

    @Override
    public float getvalue() {
        return this.value;
    }

    @Override
    public String getname() {
        return this.sensorname;
    }
}
