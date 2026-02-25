package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StockController {
    private StockService stockService;

    StockController(StockService stockService){
        this.stockService=stockService;
    }
    //Get Data from the request

    @GetMapping("/stocks")

    ArrayList<Stock> getStock()
    {
        return stockService.getAllStock();
    }
    //Get stock info of particular stock

    @GetMapping("/stocks/{id}")

    Stock getStockById(@PathVariable int id)
    {

        return stockService.getStockByID(id);
    }
    @PostMapping("/stocks")
    void addStock(@RequestBody Stock stock){
        stockService.addStock(stock);
    }
    @DeleteMapping ("/stocks/{id}")

    void deleteStock(@PathVariable int id){
        stockService.deleteStock(id);
    }
}
