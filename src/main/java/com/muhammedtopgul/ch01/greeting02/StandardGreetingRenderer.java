package com.muhammedtopgul.ch01.greeting02;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:10
 */

public class StandardGreetingRenderer implements GreetingRenderer {

    private GreetingProvider provider;

    public void setGreetingProvider(GreetingProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(provider.getGreeting());
    }
}
