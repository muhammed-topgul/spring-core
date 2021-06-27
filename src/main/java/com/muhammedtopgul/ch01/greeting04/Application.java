package com.muhammedtopgul.ch01.greeting04;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 14:32
 */

public class Application {

    public static void main(String[] args) {
        ObjectProviderFramework framework = new ObjectProviderFramework();

        GreetingRenderer renderer = (GreetingRenderer) framework.getObject("com.muhammedtopgul.ch01.greeting04.StandardGreetingRenderer");
        GreetingProvider provider = (GreetingProvider) framework.getObject("com.muhammedtopgul.ch01.greeting04.HelloWorldGreetingProviderEng");
        // GreetingProvider provider = (GreetingProvider) framework.getObject("com.muhammedtopgul.ch01.greeting04.HelloWorldGreetingProviderTr");

        renderer.setGreetingProvider(provider);
        renderer.render();

    }
}
