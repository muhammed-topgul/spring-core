package com.muhammedtopgul.ch04.configuration.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:04
 */

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

    private BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanA [beanB=" + beanB + "]";
    }
}
