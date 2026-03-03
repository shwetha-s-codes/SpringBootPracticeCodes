package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface StockRepository extends JpaRepository<Stock,Integer>{
    ArrayList<Stock> findByName(String name);
}
