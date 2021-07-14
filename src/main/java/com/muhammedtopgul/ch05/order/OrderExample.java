package com.muhammedtopgul.ch05.order;

/*
 * created by Muhammed Topgul
 * on 14/07/2021
 * at 10:37
 */

import com.muhammedtopgul.ch05.order.domain.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public class OrderExample {

    @Autowired
    private List<MyBean> beans;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrderExample.class);


        OrderExample oe = (OrderExample) context.getBean("orderExample");

        System.out.println("\nSize: " + oe.beans.size());
        oe.beans.stream().forEach(bean -> System.out.println("Bean: " + bean ));

//		oe.beans.stream().forEach(bean -> bean = null);
//
//		oe.beans.clear();
//		System.out.println("\nSize: " + oe.beans.size());

//		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
//		for (String beanName : context.getBeanDefinitionNames()) {
//			registry.removeBeanDefinition(beanName);
//		}
    }
}
