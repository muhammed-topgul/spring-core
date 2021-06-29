package com.muhammedtopgul.ch02.beanFactory.domain;

/*
 * created by Muhammed Topgul
 * on 29/06/2021
 * at 23:32
 */

public class BeanE {

    private BeanD beanD;

    public BeanD getBeanD() {
        return beanD;
    }

    public void setBeanD(BeanD beanD) {
        this.beanD = beanD;
    }

    @Override
    public String toString() {
        if (beanD != null)
            return "BeanE: " + beanD.toString();
        else
            return "BeanE: beanD is null";
    }
}
