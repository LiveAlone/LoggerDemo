package org.yqj.log.demo.jdklog;

import java.util.logging.Logger;

/**
 * Created by yaoqijun on 2017-05-15.
 */
public class JdkLoggingMain {

    private static final Logger logger = Logger.getLogger(JdkLoggingMain.class.getName());

    public static void main(String[] args) {
        System.out.println(JdkLoggingMain.class.getName());
        logger.warning("jdk logging warning");
        logger.info("jdk logging info");
    }
}
