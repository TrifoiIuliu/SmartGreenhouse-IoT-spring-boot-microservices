package io.smartgreenhouse.api.embeddedservice.models;

//This class stores the values read from input and offers functions that gives the ability to control the Greenhouse
public class GreenHouse {

    private float airTemperature;
    private float airHumidity;
    private float soilMoisture;
    private String door1State;
    private String door2State;
    private String fanState;
    private String irigationValveState;

    public GreenHouse() {
        //Hardcoded for testing
        this.airTemperature = (float) 38.1;
        this.airHumidity = 61;
        this.soilMoisture = 30;
        this.door1State = "OPEN";
        this.door2State = "CLOSE";
        this.fanState = "ON";
        this.irigationValveState = "ON";
    }

    public void openDoor1(){

    }

    public void openDoor2(){

    }

    public void closeDoor1(){

    }

    public void startIrigation(){

    }

    public void stopIrigation(){

    }

    public void startFan(){

    }

    public void stopFan(){

    }



    public float getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(float airTemperature) {
        this.airTemperature = airTemperature;
    }

    public float getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(float airHumidity) {
        this.airHumidity = airHumidity;
    }

    public float getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(float soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public String getDoor1State() {
        return door1State;
    }

    public void setDoor1State(String door1State) {
        this.door1State = door1State;
    }

    public String getDoor2State() {
        return door2State;
    }

    public void setDoor2State(String door2State) {
        this.door2State = door2State;
    }

    public String getFanState() {
        return fanState;
    }

    public void setFanState(String fanState) {
        this.fanState = fanState;
    }

    public String getIrigationValveState() {
        return irigationValveState;
    }

    public void setIrigationValveState(String irigationValveState) {
        this.irigationValveState = irigationValveState;
    }
}
