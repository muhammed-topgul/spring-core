package com.muhammedtopgul.ch04.configuration.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:05
 */

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
    private String nameOfBean;

    @Autowired
    public void setName(String nameOfBean) {
        this.nameOfBean = nameOfBean;
    }

    @Override
    public String toString() {
        return "BeanC [nameOfBean=" + nameOfBean + "]";
    }
}
