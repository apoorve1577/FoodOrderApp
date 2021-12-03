package com.food.delivery.demo.Controller;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface FoodAppInterface {

    @RequestMapping(value="/v2/orderFood",
    produces = { MediaType.APPLICATION_JSON_VALUE},
    consumes = {"application/json"},
    method = RequestMethod.POST)
    public String orderFood(@RequestBody JsonNode order) throws Exception ;

}
