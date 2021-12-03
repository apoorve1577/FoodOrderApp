package com.food.delivery.demo.Controller;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodAppController implements FoodAppInterface{


    @Override
    public String orderFood(JsonNode order) throws Exception {
        return "test";
    }
}
