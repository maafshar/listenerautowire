package com.example.listenerautowire;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.example.listenerautowire")
@SpringBootApplication
public class ListenerautowireApplication {
    private static final Logger LOGGER = LogManager.getLogger(ListenerautowireApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ListenerautowireApplication.class, args);
        LOGGER.info("################## Application Started ##################");

    }

}
