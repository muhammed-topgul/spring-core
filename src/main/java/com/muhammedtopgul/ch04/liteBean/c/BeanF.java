package com.muhammedtopgul.ch04.liteBean.c;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 13:57
 */

import org.springframework.beans.factory.annotation.Autowired;

public class BeanF {

    private String nameOfBean;

    @Autowired
    public void setNameOfBean(String nameOfBean) {
        this.nameOfBean = nameOfBean;
    }

    @Override
    public String toString() {
        return "BeanF [nameOfBean=" + nameOfBean + "]";
    }
}
