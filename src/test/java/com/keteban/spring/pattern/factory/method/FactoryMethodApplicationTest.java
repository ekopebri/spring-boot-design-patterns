package com.keteban.spring.pattern.factory.method;

import com.keteban.spring.pattern.factory.method.SocialMedia;
import com.keteban.spring.pattern.factory.method.SocialMediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class FactoryMethodApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void factoryMethodTest() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);

        System.out.println(facebook);
        System.out.println(tiktok);
        System.out.println(twitter);
        System.out.println(instagram);
    }

}