package com.example.service;

import com.example.model.Car;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class PriceEstimationService {

    private static final Logger log = LoggerFactory.getLogger(PriceEstimationService.class);

    public String greet() {
        log.info("Sending greeting");
        return "Welcome to the Price estimator!!!";
    }

    public int getPriceEstimate(Car car) {
        log.info("getPriceEstimate of car ");
        // TODO: get real price
        return car.getId().hashCode();
    }

}
