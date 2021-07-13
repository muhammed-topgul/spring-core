package com.muhammedtopgul.ch05.lazy;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:41
 */

import com.muhammedtopgul.ch05.lazy.config.ApplicationConfig;
import com.muhammedtopgul.ch05.lazy.domain.BeanA;
import com.muhammedtopgul.ch05.lazy.domain.BeanC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("com.muhammedtopgul.ch05.lazy.domain")
@Import(ApplicationConfig.class)
public class LazyExample {

    public static void main(String[] args) {
      //  getBeans1();
		getBeans2();
    }

    /**
     * Keep all beans as singleton and then run this method with eager and lazy
     * initialization of the beans.
     */
    public static void getBeans1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(LazyExample.class);

        BeanA beanA = (BeanA) context.getBean("beanA");
//		System.out.println(beanA);

//		BeanB beanB = (BeanB) context.getBean("beanB");
//		System.out.println(beanB);
    }

    /**
     * Modify all beans as prototype and then this method with eager and lazy
     * initialization of the beans.
     * Try it with and without requesting beans from the context. Do the same thing with default-lazy-init="true"
     * and default-lazy-init="false" in </beans>.
     */
    public static void getBeans2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(LazyExample.class);

//		BeanA beanA = (BeanA) context.getBean("beanA");
//		System.out.println(beanA);
//
//		BeanB beanB = (BeanB) context.getBean("beanB");
//		System.out.println(beanB);
//
//        BeanC beanC = (BeanC) context.getBean("beanC");
//        System.out.println(beanC);
//
//		BeanD beanD = (BeanD) context.getBean("beanD");
//		System.out.println(beanD);
    }
}
