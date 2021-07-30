package io.smartgreenhouse.api.embeddedservice.services;

import io.smartgreenhouse.api.embeddedservice.models.GreenHouse;
import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import io.smartgreenhouse.api.embeddedservice.models.StatusParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//This class offers functions which will do update operation on objects that stores parameters
@Component
public class ParametersService {

    @Autowired
    SetpointParameters setpointParameters;

    @Autowired
    StatusParameters statusParameters;

    @Autowired
    GreenHouse greenHouse;

    public void updateStatusParameters(){

        statusParameters.setDateAndTime(new SimpleDateFormat("dd-MM-yyy HH:mm:ss").format(new Date()));

        statusParameters.setAirTemperature(greenHouse.getAirTemperature());
        statusParameters.setAirHumidity(greenHouse.getAirHumidity());
        statusParameters.setSoilMoisture(greenHouse.getSoilMoisture());
        statusParameters.setFanState(greenHouse.getFanState());
        statusParameters.setDoor1State(greenHouse.getDoor1State());
        statusParameters.setDoor2State(greenHouse.getDoor2State());
        statusParameters.setIrigationValveState(greenHouse.getIrigationValveState());


        statusParameters.setAirTemperatureSp(setpointParameters.getAirTemperatureSp());
        statusParameters.setAirHumiditySp(setpointParameters.getAirHumiditySp());
        statusParameters.setSoilMoistureSp(setpointParameters.getSoilMoistureSp());
        statusParameters.setManFanState(setpointParameters.getManFanState());
        statusParameters.setManDoor1State(setpointParameters.getManDoor1State());
        statusParameters.setManDoor2State(setpointParameters.getManDoor2State());
        statusParameters.setManIrigationValveState(setpointParameters.getManIrigationValveState());
        statusParameters.setControlMode(setpointParameters.getControlMode());

    }

    public void updateSetpointParameters(SetpointParameters udatedSetpointParameters){
        //checkSpValuesInRange();

        setpointParameters.setAirHumiditySp(udatedSetpointParameters.getAirHumiditySp());
        setpointParameters.setAirTemperatureSp(udatedSetpointParameters.getAirTemperatureSp());
        setpointParameters.setSoilMoistureSp(udatedSetpointParameters.getSoilMoistureSp());
        setpointParameters.setManDoor1State(udatedSetpointParameters.getManDoor1State());
        setpointParameters.setManDoor2State(udatedSetpointParameters.getManDoor2State());
        setpointParameters.setManFanState(udatedSetpointParameters.getManFanState());
        setpointParameters.setManIrigationValveState(udatedSetpointParameters.getManIrigationValveState());
        setpointParameters.setControlMode(udatedSetpointParameters.getControlMode());

    }
}
