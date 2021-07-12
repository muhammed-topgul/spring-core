package com.muhammedtopgul.ch03.qualifier.renderer;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:57
 */

import com.muhammedtopgul.ch03.qualifier.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements OutputRenderer {

    GreetingProvider greetingProvider;

    @Autowired
    public void setHelloWorldGreetingProvider(@Qualifier("tr") GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
    public void render() {
        System.out.println(greetingProvider.greeting());
    }
}
