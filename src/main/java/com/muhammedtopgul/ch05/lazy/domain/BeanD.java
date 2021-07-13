package com.muhammedtopgul.ch05.lazy.domain;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:37
 */

import org.springframework.beans.factory.annotation.Autowired;


public class BeanD {

    private String name;

    @Autowired
    public BeanD(String name) {
        System.err.println("in BeanD()");
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanD [name=" + name + "]";
    }
}
