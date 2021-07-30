package io.smartgreenhouse.api.gatewayservice.models;

import org.springframework.stereotype.Component;

import java.util.List;

//This class is used for storing some db records
@Component
public class StatusParametersWrapper {

    private List<StatusParameters> StatusParametersList;

    public List<StatusParameters> getStatusParametersList() {
        return StatusParametersList;
    }

    public void setStatusParametersList(List<StatusParameters> statusParametersList) {
        StatusParametersList = statusParametersList;
    }
}
