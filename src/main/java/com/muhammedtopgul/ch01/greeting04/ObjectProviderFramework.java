package com.muhammedtopgul.ch01.greeting04;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 14:28
 */

public class ObjectProviderFramework {

    public Object getObject(String clazzName) {
        Object object = null;
        try {
            object = Class.forName(clazzName).newInstance();
        } catch (InstantiationException exception) {
            System.out.println("Can not instantiate the class: " + clazzName);
        } catch (IllegalAccessException exception) {
            System.out.println("Illegal access to the class: " + clazzName);
        } catch (ClassNotFoundException exception) {
            System.out.println("No such class found: " + clazzName);
        }

        return object;
    }
}
