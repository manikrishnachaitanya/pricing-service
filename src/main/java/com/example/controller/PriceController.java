package com.example.controller;

import com.example.service.PriceEstimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price-estimate")
public class PriceController {

    @Autowired
    PriceEstimationService priceEstimationService;

    @GetMapping("/greet")
    public String index() {
        return priceEstimationService.greet();
    }

    // TODO Add Apis

}
