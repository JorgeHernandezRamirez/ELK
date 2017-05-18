package com.jorgehernandezramirez.elk.testudp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class TestUdp {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestUdp.class);

    @Test
    public void shouldIndexLogsIntoKibana(){
        LOGGER.info("This is the first message from junit test");
        MDC.put("IPCLIENT", "192.168.0.2");
        MDC.put("METHOD", "POST");
        MDC.put("URIPATHPARAM", "/index.html");
        LOGGER.info("This is the second message from junit test");
    }
}
