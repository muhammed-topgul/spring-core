package com.muhammedtopgul.ch02.beanFactory.domain;

/*
 * created by Muhammed Topgul
 * on 29/06/2021
 * at 23:32
 */

public class BeanB {

    private BeanC beanC;

    public BeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Override
    public String toString() {
        if(beanC != null)
            return "BeanB: " + beanC.toString();
        else
            return "BeanB: " + "beanC is null";
    }
}
