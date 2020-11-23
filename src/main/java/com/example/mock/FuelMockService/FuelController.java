package com.example.mock.FuelMockService;

import com.example.mock.FuelMockService.model.FuelPrice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api")
public class FuelController {

    FuelPrice fuelPrice=new FuelPrice();
    private static DecimalFormat df=new DecimalFormat("0.00");

    @GetMapping("/price/{city}")
    public FuelPrice getFuelPrice(@PathVariable("city") String city){
        fuelPrice.setCity(city);
        Random rd=new Random();
        double random= ThreadLocalRandom.current().nextDouble(78, 85);
        double random2=Math.round(random*100.0)/100.0;
        fuelPrice.setPrice(random2);

        return fuelPrice;
    }
}
