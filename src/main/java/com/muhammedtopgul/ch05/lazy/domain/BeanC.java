package com.muhammedtopgul.ch05.lazy.domain;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:36
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

//@Lazy(false)
public class BeanC {

    private String name;
    private BeanD beanD;

    @Autowired
    public BeanC(String name, BeanD beanD) {
        System.err.println("in BeanC()");
        this.name = name;
        this.beanD = beanD;
    }

    @Override
    public String toString() {
        return "BeanC [name=" + name + ", beanD=" + beanD + "]";
    }
}
