package io.smartgreenhouse.api.embeddedservice.services;

import org.springframework.stereotype.Component;

//Used for reading controller input and set values to Greenhouse
@Component
public class ReadInputService {


    //Function that reads the input from microcontroller(in this case Raspberry Pi - using pi4j library)
    //This function sets input values to GreenHouse variables - from there these can be used in other places in the app
    public void readInput(){

    }
}
