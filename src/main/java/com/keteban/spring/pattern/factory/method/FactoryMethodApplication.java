package com.keteban.spring.pattern.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        if (type == SocialMediaType.FACEBOOK) {
            return new FacebookSocialMedia();
        } else if (type == SocialMediaType.TIKTOK) {
            return new TiktokSocialMedia();
        } else if (type == SocialMediaType.TWITTER) {
            return new TwitterSocialMedia();
        } else if (type == SocialMediaType.INSTAGRAM) {
            return  new InstagramSocialMedia();
        }

        throw new IllegalArgumentException("Unsupported Social Media Type");
    }
}
