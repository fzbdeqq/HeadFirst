package com.snail.headFirst;


import com.snail.headFirst.log.MyLog;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
//    private static final Logger log= Logger.getLogger(Main.class.toString());
    private static final Logger log= MyLog.getLog();


//    static {
//        Handler console=new ConsoleHandler();
//        console.setLevel(Level.FINEST);
//        log.addHandler(console);
//    }

    public static void main(String[] args) {
        // all→finest→finer→fine→config→info→warning→server→off
//        log.setLevel(Level.INFO);
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
        log.severe("server");
    }
}
