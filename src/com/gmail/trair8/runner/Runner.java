package com.gmail.trair8.runner;

import com.gmail.trair8.loader.LoadException;
import com.gmail.trair8.loader.TextLoader;
import com.gmail.trair8.model.impl.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private final static Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        try {
            Text text = new Text(TextLoader.load());
            LOGGER.info(text.compose());
        }catch (LoadException e){
            LOGGER.error(e);
            LOGGER.info("Text could not be loaded");
        }

    }
}
