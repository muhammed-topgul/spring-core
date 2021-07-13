package com.muhammedtopgul.ch04.resource;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 14:46
 */

import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

    public String message() {
        return "I am resource example printer";
    }
}
