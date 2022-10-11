package com.hzh;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class AppTest {

    /*
     * 没有第三方日志框架的情况下，默认使用的是JUL。
     */
    @Test
    public void test001() {
        Log log = LogFactory.getLog(AppTest.class);
        log.info("Hello JCL!!!");
    }

    /*
     * 有log4j就使用log4j
     */
    @Test
    public void test002() {
        // BasicConfigurator.configure();
        Log log = LogFactory.getLog(AppTest.class);
        log.info("Hello JCL!!!");
    }
}
