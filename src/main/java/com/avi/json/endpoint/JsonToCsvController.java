package com.avi.json.endpoint;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JsonToCsvController {

    @GetMapping("test")
    public String getTestData() {
        log.info("received request");
        return "Success";
    }
}
