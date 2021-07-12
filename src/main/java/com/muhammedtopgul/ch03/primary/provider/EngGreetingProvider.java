package com.muhammedtopgul.ch03.primary.provider;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:55
 */

import org.springframework.stereotype.Component;

@Component(value = "eng")
public class EngGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello, World!";
    }
}
