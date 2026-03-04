package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import com.example.SpringBootPracticeCodes.RESTAPIPractice.Exceptions.IDNotFoundException;
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
    public Stock getStockByID(int ID) throws IDNotFoundException {
        return stockRepository.findById(ID).orElseThrow(()->new IDNotFoundException("ID not found"));
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
