package io.smartgreenhouse.api.datapersistenceservice.resources;

import io.smartgreenhouse.api.datapersistenceservice.models.StatusParameters;
import io.smartgreenhouse.api.datapersistenceservice.models.StatusParametersWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.smartgreenhouse.api.datapersistenceservice.repository.StatusParametersRepository;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persistence")
public class PersistenceController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StatusParametersRepository statusParametersRepository;

    @Autowired
    StatusParametersWrapper statusParametersWrapper;

    @Value("${embedded.service.api}")
    String embeddedServiceApi;

//    @RequestMapping(method = RequestMethod.POST, value = "/addStatusData")
//    public void addStatusData(){
//
//    }

    @RequestMapping("/statusData")
        public StatusParametersWrapper getAllStatusData(){

        List<StatusParameters> statusParametersList = new ArrayList<>();
       statusParametersRepository.findAll().forEach(statusParametersList::add);
       statusParametersWrapper.setStatusParametersList(statusParametersList);
       return statusParametersWrapper;

    }

}
