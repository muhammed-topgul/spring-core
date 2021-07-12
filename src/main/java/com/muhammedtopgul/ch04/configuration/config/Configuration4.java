package com.muhammedtopgul.ch04.configuration.config;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:06
 */

import com.muhammedtopgul.ch04.configuration.domain.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration4 {

    public Configuration4() {
        System.out.println("==> Configuration4()");
    }

    @Bean
    public BeanD getBeanD(String string1, String string2, int int1, int int2) {
        return new BeanD(string1, string2, int1, int2);
    }

    @Bean
    public String string1() {
        return "String-1";
    }

    @Bean
    public String string2() {
        return "String-2";
    }

    @Bean
    public int int1() {
        return 1;
    }

    @Bean
    public int int2() {
        return 2;
    }
}

