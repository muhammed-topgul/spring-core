package com.muhammedtopgul.ch01.greeting01;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:10
 */

public class StandardOutputRenderer {

    private HelloWorldGreetingProvider provider;

    public void setGreetingProvider(HelloWorldGreetingProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(provider.getGreeting());
    }
}
