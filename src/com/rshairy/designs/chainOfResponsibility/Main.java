package com.rshairy.designs.chainOfResponsibility;

import com.rshairy.designs.chainOfResponsibility.LoggerDesign.DebugLogProcessor;
import com.rshairy.designs.chainOfResponsibility.LoggerDesign.ErrorLogProcessor;
import com.rshairy.designs.chainOfResponsibility.LoggerDesign.InfoLogProcessor;
import com.rshairy.designs.chainOfResponsibility.LoggerDesign.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR,"nullPointer exception");
        logger.log(LogProcessor.DEBUG,"Debug this exception");
        logger.log(LogProcessor.INFO,"Fixed issue");
    }
}
