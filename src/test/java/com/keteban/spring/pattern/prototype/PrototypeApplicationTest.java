package com.keteban.spring.pattern.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.applet.Applet;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void prototypeTest() {
        Employee pebri = applicationContext.getBean("employeeStaff", Employee.class);
        pebri.setName("Eko Pebrisulistiyo");

        Employee sulis = applicationContext.getBean("employeeManager", Employee.class);
        sulis.setName("Eko Pebrisulistiyo");

        Employee tiyo = applicationContext.getBean("employeeVicePresident", Employee.class);
        tiyo.setName("Eko Pebrisulistiyo");

        Employee ekopebri = applicationContext.getBean("employeeCLevel", Employee.class);
        ekopebri.setName("Eko Pebrisulistiyo");

        System.out.println(pebri);
        System.out.println(sulis);
        System.out.println(tiyo);
        System.out.println(ekopebri);

    }
}