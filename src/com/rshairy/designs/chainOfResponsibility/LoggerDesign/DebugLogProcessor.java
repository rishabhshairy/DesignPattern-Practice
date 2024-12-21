package com.rshairy.designs.chainOfResponsibility.LoggerDesign;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG::" + message);
        } else {
//            System.err.println("Level is::" + logLevel);
            super.log(logLevel, message);
        }
    }
}
