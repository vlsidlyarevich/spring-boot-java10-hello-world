package com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:hello.properties")
public class HelloConfig {

}
