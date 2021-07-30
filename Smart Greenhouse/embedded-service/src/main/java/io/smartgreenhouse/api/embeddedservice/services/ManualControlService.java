package io.smartgreenhouse.api.embeddedservice.services;

import io.smartgreenhouse.api.embeddedservice.models.GreenHouse;
import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This class stores the control logic for manual working mode
@Component
public class ManualControlService {
    @Autowired
    private SetpointParameters setpointParameters;

    @Autowired
    private GreenHouse greenHouse;

    //Manual working mode goes here
    public void update(){

        //used for testing purposes
        greenHouse.setDoor1State(setpointParameters.getManDoor1State());

        //example of logic
        if(setpointParameters.getManDoor1State().equals("OPEN"))
            greenHouse.openDoor1();


    }

}
