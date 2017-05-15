package org.yqj.log.demo.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yaoqijun on 2017-05-15.
 */
public class LogbackTest {

    private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args){
        if(logger.isDebugEnabled()){
            logger.debug("slf4j-logback debug message");
        }
        if(logger.isInfoEnabled()){
            logger.info("slf4j-logback info message");
        }
        if(logger.isTraceEnabled()){
            logger.trace("slf4j-logback trace message");
        }

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }

}
