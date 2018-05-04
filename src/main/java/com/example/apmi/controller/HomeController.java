package com.example.apmi.controller;

import com.example.apmi.domain.VesselDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by kasimodo on 2018-05-02.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/callAPI", method = RequestMethod.GET)
    @ResponseBody
    public List<VesselDTO> callAPI() {
        //final String url = "http://localhost:8805/searchVessel";
        final String url = "https://895248c8-34fb-416b-aac3-295b1c2dab97.traffic-emea-trial.axway.io/apim/searchVessel";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("KeyId", "dc197cea-978c-438a-8922-af42ad35ea54");

        RestTemplate template = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        ResponseEntity<List> response = template.exchange(url, HttpMethod.GET, requestEntity, List.class);
        List<VesselDTO> sttr = response.getBody();

        return sttr;

    }

}
