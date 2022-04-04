package com.github.kerner1000.examples.springboot.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("example")
@RestController
public class ExampleController {

    /**
     * Dummy endpoint to keep the service running.
     * It would shut down immediately after starting otherwise.
     *
     * @return an arbitrary example string
     */
    @GetMapping(value="hello", produces = "application/json")
    public String exampleEndpoint(){
        return "hi!";
    }
}
