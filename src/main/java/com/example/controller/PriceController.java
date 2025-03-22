package com.example.controller;

import com.example.model.Car;
import com.example.service.PriceEstimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    PriceEstimationService priceEstimationService;

    @GetMapping("/greet")
    public String index() {
        return priceEstimationService.greet();
    }

    // TODO Add Apis
    @PostMapping("/estimate")
    public int estimate(@RequestBody Car car) {
        return priceEstimationService.getPriceEstimate(car);
    }

}
