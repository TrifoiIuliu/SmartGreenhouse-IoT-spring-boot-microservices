package io.smartgreenhouse.api.gatewayservice.models;

import org.springframework.stereotype.Component;

//This class is used in the ORM process and it's parameters are being stored into the database
//In this case parameters are received from the Raspberry Pi which controls a greenhouse
@Component
public class StatusParameters {

    private Integer id;

    private String dateAndTime;

    private float airTemperatureSp;
    private float airHumiditySp;
    private float soilMoistureSp;
    private String manDoor1State;
    private String manDoor2State;
    private String manFanState;
    private String manIrigationValveState;
    private String controlMode;

    private float airTemperature;
    private float airHumidity;
    private float soilMoisture;
    private String door1State;
    private String door2State;
    private String fanState;
    private String irigationValveState;

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public float getAirTemperatureSp() {
        return airTemperatureSp;
    }

    public void setAirTemperatureSp(float airTemperatureSp) {
        this.airTemperatureSp = airTemperatureSp;
    }

    public float getAirHumiditySp() {
        return airHumiditySp;
    }

    public void setAirHumiditySp(float airHumiditySp) {
        this.airHumiditySp = airHumiditySp;
    }

    public float getSoilMoistureSp() {
        return soilMoistureSp;
    }

    public void setSoilMoistureSp(float soilMoistureSp) {
        this.soilMoistureSp = soilMoistureSp;
    }

    public String getManDoor1State() {
        return manDoor1State;
    }

    public void setManDoor1State(String manDoor1State) {
        this.manDoor1State = manDoor1State;
    }

    public String getManDoor2State() {
        return manDoor2State;
    }

    public void setManDoor2State(String manDoor2State) {
        this.manDoor2State = manDoor2State;
    }

    public String getManFanState() {
        return manFanState;
    }

    public void setManFanState(String manFanState) {
        this.manFanState = manFanState;
    }

    public String getManIrigationValveState() {
        return manIrigationValveState;
    }

    public void setManIrigationValveState(String manIrigationValveState) {
        this.manIrigationValveState = manIrigationValveState;
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

    public String getControlMode() {
        return controlMode;
    }

    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }
}
