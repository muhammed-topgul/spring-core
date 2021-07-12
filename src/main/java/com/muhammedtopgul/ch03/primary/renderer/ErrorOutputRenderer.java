package com.muhammedtopgul.ch03.primary.renderer;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:57
 */

import com.muhammedtopgul.ch03.primary.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements OutputRenderer {

    GreetingProvider greetingProvider;

    @Autowired
    public void setHelloWorldGreetingProvider(GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
    public void render() {
        System.err.println(greetingProvider.greeting());
    }
}
