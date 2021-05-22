package com.keteban.spring.pattern.factory.method;

import lombok.Getter;

@Getter
public class InstagramSocialMedia implements SocialMedia {
    private final String name = "INSTAGRAM";
    private final String url = "https://instagram.com";
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;
}
