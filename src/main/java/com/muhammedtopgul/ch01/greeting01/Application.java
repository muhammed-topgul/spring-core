package com.muhammedtopgul.ch01.greeting01;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:10
 */

public class Application {

    public static void main(String[] args) {
        StandardOutputRenderer renderer = new StandardOutputRenderer();
        HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

        renderer.setGreetingProvider(provider);
        renderer.render();
    }
}
