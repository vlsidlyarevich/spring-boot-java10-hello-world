package com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.random.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class RandomNameService implements NameService {

    private final List<String> names;

    @Autowired
    public RandomNameService(@Value("${spring-boot-java10-hello-world.hello.names}") final String[] names) {
        this.names = Arrays.asList(names);
    }

    @Override
    public String getName() {
        final Random random = new Random();
        return this.names.get(random.nextInt(names.size()));
    }
}
