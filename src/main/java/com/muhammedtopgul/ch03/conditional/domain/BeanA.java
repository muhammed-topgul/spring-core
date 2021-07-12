package com.muhammedtopgul.ch03.conditional.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:49
 */

import com.muhammedtopgul.ch03.conditional.condition.OSCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(OSCondition.class)
public class BeanA {

    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        if(beanB != null)
            return "BeanA: " + beanB.toString();
        else
            return "BeanA: " + "beanB is null";
    }

    public static BeanA create() {
        return new BeanA();
    }
}
