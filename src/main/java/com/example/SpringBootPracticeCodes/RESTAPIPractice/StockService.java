package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    //private ArrayList<Stock> listOfStocks=new ArrayList<>();
    public ArrayList<Stock> getAllStock(){
       //return listOfStocks;
        return (ArrayList<Stock>) stockRepository.findAll();

    }
    public ArrayList<Stock> getAllStockByName( String name){
        //ArrayList<Stock> result =new ArrayList<>();
        /*for(Stock stock:stockRepository.){

            if(stock.getName().equalsIgnoreCase(name))
            {
                result.add(stock);
            }
        }*/
        return  stockRepository.findByName(name);

    }
    public Optional<Stock> getStockByID(int ID){
        /*for(Stock s: listOfStocks){
            if(s.getId()==ID)
                return s;
        }
        return null;*/

        return stockRepository.findById(ID);
    }
    // Adding Stock
    public void addStock(Stock stock){

        stockRepository.save(stock);
    }
    //Deleting the stock
    public void deleteStock(int ID) {

        stockRepository.deleteById(ID);
    }


}
