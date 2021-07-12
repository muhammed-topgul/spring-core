package com.muhammedtopgul.ch03.primary.renderer;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:57
 */

import com.muhammedtopgul.ch03.primary.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements OutputRenderer {

    GreetingProvider engGreetingProvider;

    @Autowired
    public void setHelloWorldGreetingProvider(GreetingProvider engGreetingProvider) {
        this.engGreetingProvider = engGreetingProvider;
    }

    @Override
    public void render() {
        System.out.println(engGreetingProvider.greeting());
    }
}
