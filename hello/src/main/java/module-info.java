module hello {
    requires spring.beans;
    requires spring.core;
    requires spring.context;

//    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.random.services;
    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;
}
