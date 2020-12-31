package com.para.learn.springbootdemo.listener;

import com.para.learn.springbootdemo.listener.event.EmailEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailListenerTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testEmailListener() {
        EmailEvent emailEvent = new EmailEvent("para", "lidezheng@360.cn", "忠于党，忠于人民");
        applicationContext.publishEvent(emailEvent);
    }



}
