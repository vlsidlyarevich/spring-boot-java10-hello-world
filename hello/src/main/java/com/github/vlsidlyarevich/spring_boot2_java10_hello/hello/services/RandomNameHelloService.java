package com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;

import org.springframework.stereotype.Service;

@Service
public class RandomNameHelloService implements HelloService {

    @Override
    public String getHello() {
        return "HELLO FROM ANOTHER MODULE";
    }
}
