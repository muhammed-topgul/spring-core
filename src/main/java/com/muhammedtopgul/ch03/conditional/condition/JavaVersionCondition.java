package com.muhammedtopgul.ch03.conditional.condition;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:51
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class JavaVersionCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String javaVersion = context.getEnvironment().getProperty("java.version");
        assert javaVersion != null;
        if (javaVersion.equals("11"))
            return true;
        else
            return false;
    }
}
