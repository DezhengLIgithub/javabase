package com.para.springlearn.service.impl;

        import com.para.springlearn.service.MessageService;

public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "hello world";
    }
}
