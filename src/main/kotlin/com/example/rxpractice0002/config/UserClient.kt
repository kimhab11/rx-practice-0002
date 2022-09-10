package com.example.rxpractice0002.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class UserClient {

    @Bean("UserClient")
    fun userClient(): WebClient =
        WebClient
            .builder()
            .baseUrl("http://110.74.194.123:6653/")
            .build()

}