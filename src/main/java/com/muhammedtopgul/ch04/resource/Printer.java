package com.muhammedtopgul.ch04.resource;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 14:47
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Printer {

    @Resource
    // @Autowired
    private MessageProvider messageProvider;

    public void print() {
        System.out.println(messageProvider.message());
    }
}
