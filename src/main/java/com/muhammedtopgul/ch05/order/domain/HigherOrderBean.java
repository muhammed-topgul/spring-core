package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:34
 */

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(200)
public class HigherOrderBean implements MyBean {

    public HigherOrderBean() {
        System.err.println("in HigherOrderBean()");
    }
}
