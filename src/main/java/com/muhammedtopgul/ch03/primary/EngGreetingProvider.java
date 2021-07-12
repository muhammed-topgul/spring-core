package com.muhammedtopgul.ch03.primary;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:55
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EngGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello, World!";
    }
}
