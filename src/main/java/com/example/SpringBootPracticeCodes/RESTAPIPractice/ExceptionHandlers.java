package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import com.example.SpringBootPracticeCodes.RESTAPIPractice.Exceptions.IDNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//Handlers are required to define custom status codes instead of allowing spring to return its default internal server error

@RestControllerAdvice 
public class ExceptionHandlers {
    @ExceptionHandler( IDNotFoundException.class)
    public ResponseEntity<String> handleIDNotFound(IDNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
