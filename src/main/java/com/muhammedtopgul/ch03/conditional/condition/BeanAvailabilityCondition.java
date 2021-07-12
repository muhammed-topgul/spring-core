package com.muhammedtopgul.ch03.conditional.condition;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:51
 */

import com.muhammedtopgul.ch03.conditional.domain.BeanE;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanAvailabilityCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getBeanFactory();
        GenericBeanDefinition beanEDefinition = new GenericBeanDefinition();
        beanEDefinition.setBeanClass(BeanE.class);
        assert factory != null;
        factory.registerBeanDefinition("beanE", beanEDefinition);

        boolean value = context.getBeanFactory().containsBeanDefinition("beanE");
        return value;
    }
}
