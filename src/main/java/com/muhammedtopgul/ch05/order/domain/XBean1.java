package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:35
 */

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("xBean1")
//@Order(2)
public class XBean1 implements MyBean, Ordered {

    public XBean1() {
        System.err.println("in XBean1()");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}

