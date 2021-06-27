package com.muhammedtopgul.ch01.greeting05;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 14:28
 */

public class ObjectProviderFramework {

    private GreetingRenderer renderer;
    private GreetingProvider provider;

    public Object getObject(String clazzName1, String clazzName2) {
        Object object1 = null;
        Object object2 = null;

        try {
            object1 = Class.forName(clazzName1).getDeclaredConstructor().newInstance();
            object2 = Class.forName(clazzName2).getDeclaredConstructor().newInstance();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        if (object1 instanceof GreetingRenderer) {
            renderer = (GreetingRenderer) object1;
        }

        if (object2 instanceof GreetingProvider) {
            provider = (GreetingProvider) object2;
        }

        renderer.setGreetingProvider(provider);

        return renderer;
    }
}
