package org.yqj.log.demo.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yaoqijun on 2017/5/15.
 */
public class Slf4jMainTest {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jMainTest.class);

    public static void main(String[] args) {
        if(logger.isDebugEnabled()){
            logger.debug("slf4j-log4j debug message");
        }
        if(logger.isInfoEnabled()){
            logger.debug("slf4j-log4j info message");
        }
        if(logger.isTraceEnabled()){
            logger.debug("slf4j-log4j trace message");
        }
    }
}
