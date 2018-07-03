package com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;

import com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.random.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomNameHelloService implements HelloService {

//    private final NameService nameService;
//
//    @Autowired
//    public RandomNameHelloService(final NameService nameService) {
//        this.nameService = nameService;
//    }

    @Override
    public String getHello() {
        return String.format("Hello %s!", "asd");
    }
}
