package com.example.SpringBootPracticeCodes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AssetService {
    public String getStockInfo(){
        return "Apple:$150";
    }
}
