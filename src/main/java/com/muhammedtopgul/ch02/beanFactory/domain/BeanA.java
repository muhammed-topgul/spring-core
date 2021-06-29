package com.muhammedtopgul.ch02.beanFactory.domain;

/*
 * created by Muhammed Topgul
 * on 29/06/2021
 * at 23:31
 */

public class BeanA {

    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

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
