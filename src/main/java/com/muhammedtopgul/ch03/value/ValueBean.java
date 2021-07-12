package com.muhammedtopgul.ch03.value;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 11:39
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//@PropertySource("classpath:ch03/value/app.properties")
// Or for following line give a JVM parameter: -DmyDesktop=/Users/muhammed.topgul/Desktop
//@PropertySource("file:${myDesktop}/resources/app.properties")
@PropertySources({
        @PropertySource("classpath:ch03/value/bean.properties"),
        @PropertySource("classpath:ch03/value/app.properties"),
})
public class ValueBean {

    @Value(value = "5") // Or @Value("5")
    private int i;

    @Value("${intValue}")
    private int intValue;

    // A property with default value
    @Value("${noSuchParam:555}")
    private int noSuchParam;

    @Value(value = "#{systemProperties['java.version']}")
    private String javaVersion;

    @Value(value = "#{systemProperties['os.name']}")
    private String osName;

    @Value("#{systemProperties}")
    private Map<String, String> systemProperties;

    @Value("#{aBean.pi}")
    private double pi;

    @Value("#{aBean.i}")
    private int anInt;

    @Value("#{aBean.author}")
    private String author;

    @Value("${name}")
    private String name;

    private String statement;

    private String anotherStatement;

    private String yetAnotherStatement;

    public ValueBean(@Value("${sentence1}") String statement) {
        this.statement = statement;
    }

    @Autowired
    public void setAnotherStatement(@Value("${sentence2}") String statement) {
        this.anotherStatement = statement;
    }

    @Autowired
    public void f(@Value("${sentence3}") String statement) {
        this.yetAnotherStatement = statement;
    }

    public Map<String, String> getSystemProperties() {
        return systemProperties;
    }

    @Override
    public String toString() {
        return "ValueBean [ author=" + author + " i=" + i + ", intValue=" + intValue + ", noSuchParam=" + noSuchParam + ", javaVersion=" + javaVersion + ", osName=" + osName + ", pi=" + pi + ", anInt="
                + anInt + ", name=" + name + ", statement=" + statement + ", anotherStatement=" + anotherStatement + ", yetAnotherStatement="
                + yetAnotherStatement + "]";
    }

}
