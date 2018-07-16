//Open for spring CGLIB
open module hello {
    requires spring.beans;
    requires spring.core;
    requires spring.context;

    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;
    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.config;
}
