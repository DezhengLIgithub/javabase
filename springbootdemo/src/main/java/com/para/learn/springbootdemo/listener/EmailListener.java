package com.para.learn.springbootdemo.listener;

import com.para.learn.springbootdemo.listener.event.EmailEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailListener implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent emailEvent) {
        log.info("邮件地址: {}", emailEvent.getEmail());
        log.info("邮件内容: {}", emailEvent.getContent());
    }
}
