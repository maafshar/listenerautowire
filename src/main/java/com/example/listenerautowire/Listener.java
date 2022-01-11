package com.example.listenerautowire;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletContextListener {
    @Autowired
    private Environment env;

    private static final Logger LOGGER = LogManager.getLogger(Listener.class.getName());


    // @Autowired
    // public Listener(Environment env)
    // {
    //     this.env=env;
    //     // this.tmpDataSource=tmpDataSource;
    // }
    public Listener() {
    }

    // Create Service Context
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            if (env == null) {
                LOGGER.error("************* env is null on spring boot recent versions such as 2.6.2 - it is not null on version 2.3.1.RELEASE *************");
            } else {
                LOGGER.info("************* env is not null on version 2.3.1.RELEASE *************");
                sce.getServletContext().setAttribute("ServiceContext", env);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("ServiceContext", null);
    }
}

