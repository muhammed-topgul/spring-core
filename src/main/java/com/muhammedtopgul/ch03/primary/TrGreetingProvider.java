package com.muhammedtopgul.ch03.primary;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:55
 */

import org.springframework.stereotype.Component;

@Component
public class TrGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Merhaba, Dünya!";
    }
}
