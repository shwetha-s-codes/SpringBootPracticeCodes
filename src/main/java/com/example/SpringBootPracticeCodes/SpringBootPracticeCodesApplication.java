package com.example.SpringBootPracticeCodes;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPracticeCodesApplication {

	public static void main(String[] args) {

        ApplicationContext  context=SpringApplication.run(SpringBootPracticeCodesApplication.class, args);
        AssetController ac=context.getBean(AssetController.class);

        System.out.println( ac.getStock());

	}

}
