package com.muhammedtopgul.ch03.conditional.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:49
 */

import com.muhammedtopgul.ch03.conditional.condition.JavaVersionCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(JavaVersionCondition.class)
public class BeanB {

    private String name;

    @Value("${user.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanB [name=" + name + "]";
    }
}
