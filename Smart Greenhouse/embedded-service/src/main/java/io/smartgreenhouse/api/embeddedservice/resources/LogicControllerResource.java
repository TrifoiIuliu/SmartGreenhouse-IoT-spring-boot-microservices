package io.smartgreenhouse.api.embeddedservice.resources;

import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import io.smartgreenhouse.api.embeddedservice.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//This class is responsible for managing the microcontroller control logic
@Component
public class LogicControllerResource  {

@Autowired
private SetpointParameters setpointParameters;

@Autowired
private AutomaticControlService automaticControlService;

@Autowired
private ReadInputService readInputService;

@Autowired
private WriteOutputService writeOutputService;

@Autowired
private ManualControlService manualControlService;

@Scheduled(fixedRate = 1000)
    public void run(){
    readInputService.readInput();

        if(setpointParameters.getControlMode().equals("AUTO"))
            automaticControlService.update();
        else
            manualControlService.update();

    writeOutputService.writeOutput();

    }

}
