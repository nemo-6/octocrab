package com.abubakir.octocrab.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public OkHttpClient httpClient() {
        return new OkHttpClient();
    }

}
