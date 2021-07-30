package io.smartgreenhouse.api.embeddedservice.services;

import io.smartgreenhouse.api.embeddedservice.models.GreenHouse;
import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This class stores the control logic for automatic working mode
@Component
public class AutomaticControlService {

    @Autowired
    private GreenHouse greenHouse;

    @Autowired
    private SetpointParameters setpointParameters;

    public void update(){

        //Used for testing purposes
        if(greenHouse.getAirTemperature()>35)
            greenHouse.setDoor1State("OPEN");
        else
            greenHouse.setDoor1State("CLOSE");

        //Exeample of logic
        if(greenHouse.getAirTemperature()>35)
            greenHouse.openDoor1();
        else
            greenHouse.closeDoor1();
    }

}
