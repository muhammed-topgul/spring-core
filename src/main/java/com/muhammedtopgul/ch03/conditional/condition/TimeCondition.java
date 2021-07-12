package com.muhammedtopgul.ch03.conditional.condition;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:52
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TimeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        LocalDate date = LocalDate.now();
        int day = date.get(ChronoField.DAY_OF_WEEK);
//		day = 6;
        boolean value = false;

        if (day <= 5) value = true;

        return value;
    }
}

