package com.rshairy.solid.chainOfResponsibility.LoggerDesign;

public class InfoLogProcessor extends LogProcessor {

    // here we will pass next log processor
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO::" + message);
        } else {
//            System.err.println("Level is::" + logLevel);
            super.log(logLevel, message);
        }

    }
}
