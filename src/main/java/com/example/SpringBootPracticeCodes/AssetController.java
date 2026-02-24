package com.example.SpringBootPracticeCodes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class AssetController {
    @Autowired
    private AssetService assetService;

    @PostConstruct
    void display(){
        System.out.println("Use the service to get stock price");
    }

    public String getStock()
    {
        return assetService.getStockInfo();
    }


}
