package com.avntechgroup.meco.xandar.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController for demonstration puposes
 *
 * DemoRestController
 * @author AVN
 */
@RestController
public class DemoRestController {


    /**
     * Hello world endpoint
     *
     * @param name The name to greet.
     * @return A Greeting.
     * @since 1.0.0
     */
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}
