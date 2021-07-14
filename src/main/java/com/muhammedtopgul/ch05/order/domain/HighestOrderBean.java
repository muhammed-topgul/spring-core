package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:34
 */

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HighestOrderBean implements MyBean {

    public HighestOrderBean() {
        System.err.println("in HighestOrderBean()");
    }
}
