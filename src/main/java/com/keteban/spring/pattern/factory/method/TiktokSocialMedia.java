package com.keteban.spring.pattern.factory.method;

import lombok.Data;

@Data
public class TiktokSocialMedia implements SocialMedia {
    private final String name = "TIKTOK";
    private final String url = "https://tiktok.com";
    private final SocialMediaType type = SocialMediaType.TIKTOK;
}
