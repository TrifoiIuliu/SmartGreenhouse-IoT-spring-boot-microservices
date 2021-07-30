package io.smartgreenhouse.api.gatewayservice.resources;

import io.smartgreenhouse.api.gatewayservice.models.SetpointParameters;
import io.smartgreenhouse.api.gatewayservice.models.StatusParameters;
import io.smartgreenhouse.api.gatewayservice.models.StatusParametersWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${embedded.service.updateStatusParameters.api}")
    String embeddedSetpointApi;

    @Value("${embedded.service.getRealtimeStatusParameters.api}")
    String embeddedRealtimeParameterstApi;

    @Value("${persistence.service.getAllParametersRecords.api}")
    String persistenceAllParametersApi;

    @RequestMapping(method = RequestMethod.POST, value = "/setpointParameters")
    public SetpointParameters updateSetpointParameters(@RequestBody SetpointParameters receivedSetpointParameters){

        SetpointParameters returnedSetpointParameters = restTemplate.postForObject(embeddedSetpointApi,receivedSetpointParameters,SetpointParameters.class);
       return returnedSetpointParameters;

    }

    @RequestMapping("/allParametersRecords")
    public List<StatusParameters> getAllParametersRecords(){

        StatusParametersWrapper parametersWrapper = restTemplate.getForObject(persistenceAllParametersApi,StatusParametersWrapper.class);
        return parametersWrapper.getStatusParametersList();
    }


    @RequestMapping("/realtimeParameters")
    public StatusParameters getRealtimeParameters(){

       StatusParameters realtimeParameters = restTemplate.getForObject(embeddedRealtimeParameterstApi, StatusParameters.class);
        return realtimeParameters;
    }

}
