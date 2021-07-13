package com.muhammedtopgul.ch04.liteBean;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 13:55
 */

import com.muhammedtopgul.ch04.liteBean.a.BeanA;
import com.muhammedtopgul.ch04.liteBean.b.BeanB;
import com.muhammedtopgul.ch04.liteBean.c.BeanD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.muhammedtopgul.ch04.liteBean.c"})
public class LiteBeanExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LiteBeanExample.class);
        // getBeans1(context);
        // getBeans2(context);
        getBeans3(context);
    }

    /**
     * Use: @ComponentScan("com.muhammedtopgul.ch04.liteBean.a")
     *
     * @param context
     */
    public static void getBeans1(AnnotationConfigApplicationContext context) {
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }

    /**
     * Use: @ComponentScan("com.muhammedtopgul.ch04.liteBean.b")
     *
     * @param context
     */
    public static void getBeans2(AnnotationConfigApplicationContext context) {
        BeanB beanB = context.getBean(BeanB.class);
        System.out.println(beanB);
    }

    /**
     * Use: @ComponentScan("com.muhammedtopgul.ch04.liteBean.c")
     *
     * @param context
     */
    public static void getBeans3(AnnotationConfigApplicationContext context) {
        BeanD beanD = context.getBean(BeanD.class);
        System.out.println(beanD);
    }
}
