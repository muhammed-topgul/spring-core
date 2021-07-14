package com.muhammedtopgul.ch05.order.config;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:36
 */

import com.muhammedtopgul.ch05.order.domain.YBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ApplicationConfig {

    @Bean
    @Order(-100)
    public YBean yBean() {
        return new YBean();
    }
}

