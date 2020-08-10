package com.snail.headFirst.log;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 16:05
 * @Version 1.0
 */
public class MyLog {
    private static Logger log=null;

    private MyLog(){}

    public static Logger getLog(){
        InputStream is=null;
        try {
            if(log==null){
                is=MyLog.class.getClassLoader().getResourceAsStream("logger.properties");
                LogManager.getLogManager().readConfiguration(is);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        log=Logger.getLogger("java.util.logging.ConsoleHandler");
        return log;
    }
}
