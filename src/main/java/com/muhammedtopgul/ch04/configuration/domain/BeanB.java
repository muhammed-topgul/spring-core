package com.muhammedtopgul.ch04.configuration.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:05
 */

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
    private String name;
    private int age;
    private BeanC beanC;

    @Autowired
    public BeanB(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Override
    public String toString() {
        return "BeanB [name=" + name + ", age=" + age + ", beanC=" + beanC + "]";
    }
}