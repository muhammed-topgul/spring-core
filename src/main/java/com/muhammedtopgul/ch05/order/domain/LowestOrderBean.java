package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:35
 */

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class LowestOrderBean implements MyBean {

    public LowestOrderBean() {
        System.err.println("in LowestOrderBean()");
    }
}

