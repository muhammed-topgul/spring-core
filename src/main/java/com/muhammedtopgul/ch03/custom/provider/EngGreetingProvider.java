package com.muhammedtopgul.ch03.custom.provider;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:55
 */

import com.muhammedtopgul.ch03.custom.annotation.Eng;
import org.springframework.stereotype.Component;

@Eng
@Component
public class EngGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello, World!";
    }
}
