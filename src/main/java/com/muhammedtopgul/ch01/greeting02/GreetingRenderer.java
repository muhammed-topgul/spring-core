package com.muhammedtopgul.ch01.greeting02;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:24
 */

public interface GreetingRenderer {

    void setGreetingProvider(GreetingProvider provider);

    void render();
}
