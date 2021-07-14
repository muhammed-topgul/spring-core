package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:35
 */

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1000)
public class LowerOrderBean implements MyBean {

    public LowerOrderBean() {
        System.err.println("in LowerOrderBean()");
    }
}
