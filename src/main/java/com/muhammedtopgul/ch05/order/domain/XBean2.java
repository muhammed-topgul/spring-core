package com.muhammedtopgul.ch05.order.domain;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:36
 */

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("xBean2")
//@Order(2)
public class XBean2 implements MyBean, Ordered {

    public XBean2() {
        System.err.println("in XBean2()");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}

