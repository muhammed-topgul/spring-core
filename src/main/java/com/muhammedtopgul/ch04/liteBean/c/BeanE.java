package com.muhammedtopgul.ch04.liteBean.c;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 13:56
 */

public class BeanE {

    private String name;
    private int number;

    public BeanE(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "BeanE [name=" + name + ", number=" + number + "]";
    }
}
