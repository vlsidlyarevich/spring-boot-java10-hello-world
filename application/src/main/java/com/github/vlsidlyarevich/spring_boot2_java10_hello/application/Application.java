package com.github.vlsidlyarevich.spring_boot2_java10_hello.application;

import com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.github.vlsidlyarevich.spring_boot2_java10_hello")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        var bean = context.getBean(HelloService.class);
        System.out.println(bean.getHello());
    }
}
