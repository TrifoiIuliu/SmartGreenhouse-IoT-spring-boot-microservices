package io.smartgreenhouse.api.embeddedservice;

import io.smartgreenhouse.api.embeddedservice.models.GreenHouse;
import io.smartgreenhouse.api.embeddedservice.models.SetpointParameters;
import io.smartgreenhouse.api.embeddedservice.models.StatusParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
public class EmbeddedServiceApplication {

	@Bean
	public GreenHouse getGreenHouse(){
		return new GreenHouse();
	}
	@Bean
	public StatusParameters getStatusParameters(){
		return new StatusParameters();
	}
	@Bean
	public SetpointParameters getSetpointParameters(){
		return new SetpointParameters();
	}

	public static void main(String[] args) {

		SpringApplication.run(EmbeddedServiceApplication.class, args);

	}

}

