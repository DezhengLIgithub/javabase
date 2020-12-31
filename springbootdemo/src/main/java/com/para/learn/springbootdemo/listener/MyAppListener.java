package com.para.learn.springbootdemo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyAppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("容器中初始化的bean数量:{}", contextRefreshedEvent.getApplicationContext().getBeanDefinitionCount());
        String[] beanDefinitionNames = contextRefreshedEvent.getApplicationContext().getBeanDefinitionNames();
        for(String name : beanDefinitionNames) {
            log.info("bean name:{}", name);
        }
    }
}
