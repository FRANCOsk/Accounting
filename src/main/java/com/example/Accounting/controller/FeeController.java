package com.example.Accounting.controller;

import com.example.Accounting.service.FeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class FeeController {
    FeeService feeService;


public FeeController(FeeService feeService) {
        this.feeService = feeService;
    }

@GetMapping(value="/fee/{feeName}/{algoritm}")
public int getFinalPrice(@PathVariable String feeName, @PathVariable String algoritm) {

        return feeService.getFee(feeName, algoritm);

}


}