package com.muhammedtopgul.ch03.conditional.condition;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:51
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OSCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String os = context.getEnvironment().getProperty("os.name");
        assert os != null;
        if (os.contains("Win"))
            return true;
        else
            return false;
    }
}
