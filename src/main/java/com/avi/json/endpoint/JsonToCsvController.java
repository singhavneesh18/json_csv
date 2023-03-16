package com.avi.json.endpoint;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.net.URI;

@RestController
@Slf4j
public class JsonToCsvController {

    @GetMapping("test")
    public String getTestData() {
        log.info("received request");
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URI.create("http://localhost:9090/getJsonSampleData"), String.class);
        return "Success: "+result;
    }


    @GetMapping("getJsonSampleData")
    public String getJsonData() throws IOException {
        File file = new File("/home/avneesh/data/workspace/json_csv/src/main/resources/sample_json_data/1.json");
        return FileUtils.readFileToString(file, Charsets.UTF_8);
    }
}
