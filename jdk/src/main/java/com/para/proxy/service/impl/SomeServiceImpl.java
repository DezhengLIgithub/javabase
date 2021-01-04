package com.para.proxy.service.impl;

import com.para.proxy.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("execute doSome method ...");
    }

    @Override
    public void doOther() {
        System.out.println("execute doOther method ...");
    }
}
