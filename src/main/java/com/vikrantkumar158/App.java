package com.vikrantkumar158;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static final Logger L = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        L.debug("This is debug");
        L.info("This is info");
        L.warn("This is warn");
        L.error("This is error");
        L.fatal("This is fatal");
    }
}