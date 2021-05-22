package com.keteban.spring.pattern.factory.method;

import lombok.Data;

@Data
public class TwitterSocialMedia implements SocialMedia {
    private final String name = "TWITTER";
    private final String url = "https://twitter.com";
    private final SocialMediaType type = SocialMediaType.TWITTER;
}
