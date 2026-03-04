package com.example.SpringBootPracticeCodes.RESTAPIPractice.Exceptions;

import org.yaml.snakeyaml.events.Event;

public class IDNotFoundException extends Exception{
    public IDNotFoundException(String message)
    {
        super(message);
    }
}
