package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:36
 */

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("zBean")
@Order(1)
public class ZBean implements MyBean {

    public ZBean() {
        System.err.println("in ZBean()");
    }
}