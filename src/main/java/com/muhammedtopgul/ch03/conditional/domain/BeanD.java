package com.muhammedtopgul.ch03.conditional.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:49
 */

import com.muhammedtopgul.ch03.conditional.condition.BeanAvailabilityCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(BeanAvailabilityCondition.class)
public class BeanD {

    private BeanC beanC;
    private BeanE beanE;

    @Autowired
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Autowired
    public void setBeanE(BeanE beanE) {
        this.beanE = beanE;
    }

    @Override
    public String toString() {
        return "BeanD [beanC=" + beanC + ", beanE=" + beanE + "]";
    }
}
