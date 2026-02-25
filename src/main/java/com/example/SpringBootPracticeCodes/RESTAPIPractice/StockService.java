package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Service
public class StockService {

    private ArrayList<Stock> listOfStocks=new ArrayList<>();
    public ArrayList<Stock> getAllStock(){
       return listOfStocks;

    }
    public Stock getStockByID(int ID){
        for(Stock s: listOfStocks){
            if(s.getId()==ID)
                return s;
        }
        return null;
    }
    // Adding Stock
    public void addStock(Stock stock){

        listOfStocks.add(stock);
    }
    //Deleting the stock
    public void deleteStock(int ID) {

        listOfStocks.removeIf(s -> s.getId()== ID);
    }


}
