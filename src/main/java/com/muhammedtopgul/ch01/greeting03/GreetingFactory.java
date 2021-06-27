package com.muhammedtopgul.ch01.greeting03;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 13:40
 */

import java.io.FileInputStream;
import java.util.Properties;

public class GreetingFactory implements Factory {

    private static final GreetingFactory instance;

    private GreetingRenderer renderer;
    private GreetingProvider provider;

    static {
        instance = new GreetingFactory();
    }

    {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\muhammed.topgul\\IdeaProjects\\akin-kaldiroglu\\spring-core\\src\\main\\java\\com\\muhammedtopgul\\ch01\\greeting03\\resources\\application.properties"));

            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            renderer = (GreetingRenderer) Class.forName(rendererClass).newInstance();
            provider = (GreetingProvider) Class.forName(providerClass).newInstance();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static GreetingFactory getInstance() {
        return instance;
    }

    @Override
    public GreetingRenderer getGreetingRenderer() {
        return renderer;
    }

    @Override
    public GreetingProvider getGreetingProvider() {
        return provider;
    }
}
