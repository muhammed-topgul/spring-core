package com.muhammedtopgul.ch03.value;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 11:39
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aBean")
public class ABean {

    private final int i;
    private final double pi;
    private String author;

    public ABean(@Value("${z}") int zValue, @Value("${p}") double xValue) {
        i = zValue * 10;
        pi = xValue;
    }

    public int getI() {
        return i;
    }

    public double getPi() {
        return pi;
    }

    public String getAuthor() {
        return "Muhammed Topgül";
    }

    @Override
    public String toString() {
        return "ABean [i=" + i + ", pi=" + pi + "]";
    }
}
