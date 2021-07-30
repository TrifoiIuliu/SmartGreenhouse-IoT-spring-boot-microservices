package io.smartgreenhouse.api.embeddedservice.models;

//This class stores a set of parameters which will be received externally and used to adjust the
//control of the greenhouse
public class SetpointParameters {

   private float airTemperatureSp=0;
   private float airHumiditySp=0;
   private float soilMoistureSp=0;
   private String manDoor1State="CLOSE";
   private String manDoor2State="CLOSE";
   private String manFanState="OFF";
   private String manIrigationValveState="OFF";
   private String controlMode="MAN";

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

   public String getControlMode() {
      return controlMode;
   }

   public void setControlMode(String controlMode) {
      this.controlMode = controlMode;
   }
}
