package io.smartgreenhouse.api.datapersistenceservice.resources;

import io.smartgreenhouse.api.datapersistenceservice.models.StatusParameters;
import io.smartgreenhouse.api.datapersistenceservice.repository.StatusParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DataAcquisitionController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StatusParametersRepository statusParametersRepository;

    @Value("${embedded.service.api}")
    String embeddedServiceApi;


    @Scheduled(fixedRate = 5000)
    public void acquireData(){

        StatusParameters statusParameters = restTemplate.getForObject(embeddedServiceApi,StatusParameters.class);
        statusParametersRepository.save(statusParameters);
    }

}
