package com.github.kerner1000.examples.springboot.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {

    /**
     * Dummy endpoint to keep the service running. It would shut down immediately after starting, otherwise.
     * @return an arbitrary example string
     */
    @GetMapping(value="example", produces = "application/json")
    public String exampleEndpoint(){
        return "hi!";
    }
}
