package com.muhammedtopgul.ch03.custom.renderer;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:57
 */

import com.muhammedtopgul.ch03.custom.annotation.Eng;
import com.muhammedtopgul.ch03.custom.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements OutputRenderer {

    GreetingProvider greetingProvider;

    @Autowired
    public void setHelloWorldGreetingProvider(@Eng GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
    public void render() {
        System.err.println(greetingProvider.greeting());
    }
}
