package com.example.project1.controller;

import com.example.project1.service.CompanyPricePredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CompanyPricePredictionService {

    private final com.example.project1.service.CompanyPricePredictionService companyPricePredictionService;

    @PostMapping("/predict")
    public ResponseEntity<Double> predictPrice(@RequestParam(name = "companyId") Long companyId) {
        double predictedPrice = companyPricePredictionService.predictNextMonth(companyId);
        return ResponseEntity.ok(predictedPrice);
    }
}
