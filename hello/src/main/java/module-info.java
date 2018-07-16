//Open for spring CGLIB
open module hello {
    requires transitive spring.beans;
    requires transitive spring.core;
    requires transitive spring.context;

    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;
    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.config;
}
