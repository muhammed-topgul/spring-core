package com.muhammedtopgul.ch01.greeting03;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:38
 */

public interface Factory {

    GreetingRenderer getGreetingRenderer();

    GreetingProvider getGreetingProvider();
}
