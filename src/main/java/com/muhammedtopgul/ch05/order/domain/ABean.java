package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:34
 */

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aBean")
@Order(100)
@DependsOn("zBean")
public class ABean implements MyBean {

    public ABean() {
        System.err.println("in ABean()");
    }
}
