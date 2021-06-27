package com.muhammedtopgul.ch01.greeting03;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:51
 */

public class Application {

    public static void main(String[] args) {
        Factory factory = GreetingFactory.getInstance();

        GreetingRenderer renderer = factory.getGreetingRenderer();
        GreetingProvider provider = factory.getGreetingProvider();
        renderer.setGreetingProvider(provider);
        renderer.render();
    }
}
