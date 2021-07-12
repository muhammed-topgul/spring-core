package com.muhammedtopgul.ch03.custom.annotation;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 10:36
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Eng {
}
