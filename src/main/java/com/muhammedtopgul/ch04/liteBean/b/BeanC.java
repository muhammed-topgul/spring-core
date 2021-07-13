package com.muhammedtopgul.ch04.liteBean.b;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 13:56
 */

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {

    private String nameOfBean;

    @Autowired
    public void setNameOfBean(String nameOfBean) {
        this.nameOfBean = nameOfBean;
    }

    @Override
    public String toString() {
        return "BeanC [nameOfBean=" + nameOfBean + "]";
    }
}
