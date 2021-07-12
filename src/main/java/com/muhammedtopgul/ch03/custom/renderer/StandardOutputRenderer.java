package com.muhammedtopgul.ch03.custom.renderer;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:57
 */

import com.muhammedtopgul.ch03.custom.annotation.Tr;
import com.muhammedtopgul.ch03.custom.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardOutputRenderer implements OutputRenderer {

    GreetingProvider provider;

    @Autowired
    public void setProvider(@Tr GreetingProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.greeting());
    }
}
