package com.muhammedtopgul.ch02.beanFactory.domain;

/*
 * created by Muhammed Topgul
 * on 29/06/2021
 * at 23:32
 */

public class BeanD {

    private BeanC beanC;

    public BeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Override
    public String toString() {
        return "BeanD: " + beanC.toString();
    }
}
