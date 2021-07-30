package io.smartgreenhouse.api.embeddedservice.resources;

import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import io.smartgreenhouse.api.embeddedservice.models.StatusParameters;
import io.smartgreenhouse.api.embeddedservice.services.ParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.lang.reflect.Parameter;

@RestController
@RequestMapping("/embedded")
public class CommunicationResource {

    @Autowired
    StatusParameters statusParameters;

    @Autowired
    ParametersService parametersService;

    @Autowired
    SetpointParameters setpointParameters;

    @RequestMapping("/getStatusParameters")
    public StatusParameters getStatusParameters(){
        //update status parameters
        parametersService.updateStatusParameters();
        return statusParameters;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateSetpointParameters")
    public SetpointParameters updateSetpointParameters(@RequestBody SetpointParameters updatedSetpointParameters){

        parametersService.updateSetpointParameters(updatedSetpointParameters);
        return setpointParameters;
    }
}
