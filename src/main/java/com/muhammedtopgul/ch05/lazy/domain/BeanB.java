package com.muhammedtopgul.ch05.lazy.domain;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:36
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanB {

    private String name;

    @Autowired
    public BeanB(String name) {
        System.err.println("in BeanB()");
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanB [name=" + name + "]";
    }
}
