package com.example.SpringBootPracticeCodes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {
    private AssetService assetService;

    AssetController(AssetService assetService)
    {
        this.assetService=assetService;
    }
    @GetMapping("/getStock")
    public String getStock()
    {
        return assetService.getStockInfo();
    }


}
