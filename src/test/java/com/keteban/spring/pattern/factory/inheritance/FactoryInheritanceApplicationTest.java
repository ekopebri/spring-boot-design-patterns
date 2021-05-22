package com.keteban.spring.pattern.factory.inheritance;

import com.keteban.spring.pattern.factory.method.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testInheritance() {
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);

        System.out.println(facebook.getName());
    }
}