package com.muhammedtopgul.ch03.conditional.domain;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:49
 */

import com.muhammedtopgul.ch03.conditional.condition.TimeCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Conditional(TimeCondition.class)
public class BeanC {

    private LocalDate date;

    @Value("#{T(java.time.LocalDate).now()}")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BeanC [date=" + date + "]";
    }
}

