package com.example.SpringBootPracticeCodes;

import org.springframework.stereotype.Service;

@Service
public class AssetService {
    public String getStockInfo(){
        return "Apple:$150";
    }
}
