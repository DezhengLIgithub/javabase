package com.para.learn.springbootdemo.listener.event;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent {

    private String email;

    private String content;

    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source, String email, String content) {
        super(source);
        this.email = email;
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
