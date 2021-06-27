package com.muhammedtopgul.ch01.greeting02;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:10
 */

public class Application {
    public static void main(String[] args) {
        GreetingRenderer renderer = new StandardGreetingRenderer();
        GreetingProvider providerEng = new HelloWorldGreetingProviderEng();
        GreetingProvider providerTr = new HelloWorldGreetingProviderTr();

        renderer.setGreetingProvider(providerEng);
        renderer.setGreetingProvider(providerTr);
        renderer.render();
    }
}
