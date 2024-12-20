package com.rshairy.solid.chainOfResponsibility;

import com.rshairy.solid.chainOfResponsibility.LoggerDesign.DebugLogProcessor;
import com.rshairy.solid.chainOfResponsibility.LoggerDesign.ErrorLogProcessor;
import com.rshairy.solid.chainOfResponsibility.LoggerDesign.InfoLogProcessor;
import com.rshairy.solid.chainOfResponsibility.LoggerDesign.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR,"nullPointer exception");
        logger.log(LogProcessor.DEBUG,"Debug this exception");
        logger.log(LogProcessor.INFO,"Fixed issue");
    }
}
