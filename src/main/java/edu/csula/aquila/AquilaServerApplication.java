package edu.csula.aquila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AquilaServerApplication {

    public static void main( String[] args )
    {
        SpringApplication.run( AquilaServerApplication.class, args );
    }
}
