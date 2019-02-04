# Spring boot and java 10 hello world

--- 

### Description

Gradle-based Spring boot 2.0 hello world written with Java 10. Illustrates project Jigsaw posibilities along with Spring boot 2.0 via Gradle.<p> 
This example shows that it is possible to integrate Spring boot 2.0 with java 10 and Jigsaw via Gradle build but it is not so easy to use and there are a lot of pitfalls.<p> 
Also for that moment **i am not implemented test integration**.<p>
It is just an example and my experience of project jigsaw, gradle and spring.<p>
<p>

If you have any ideas please **feel free to contribute!** :) 

--- 

### Environment prerequisites

``` bash
✗ java -version
java version "10.0.1" 2018-04-17
Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.1+10, mixed mode)


✗ gradle -version

------------------------------------------------------------
Gradle 4.8
------------------------------------------------------------

Build time:   2018-06-04 10:39:58 UTC
Revision:     9e1261240e412cbf61a5e3a5ab734f232b2f887d

Groovy:       2.4.12
Ant:          Apache Ant(TM) version 1.9.11 compiled on March 23 2018
JVM:          10.0.1 ("Oracle Corporation" 10.0.1+10)
OS:           Mac OS X 10.13.4 x86_64
```

### Build and running

* Open project in your favourite IDE and run [Application.java](https://github.com/vlsidlyarevich/spring-boot-java10-hello-world/blob/master/application/src/main/java/com/github/vlsidlyarevich/spring_boot2_java10_hello/application/Application.java)
* **OR** Open terminal in the project root and run ```gradle clean build```, after that run created jar with ```java -jar jarname```

### How it works

There are 2 modules in the project: application and hello.

#### Hello module
Hello module contains following [module-info.java](https://github.com/vlsidlyarevich/spring-boot-java10-hello-world/blob/master/hello/src/main/java/module-info.java):


```java
//Open for spring CGLIB
open module hello {
    requires transitive spring.beans;
    requires transitive spring.core;
    requires transitive spring.context;

    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.services;
    exports com.github.vlsidlyarevich.spring_boot2_java10_hello.hello.config;
}
``` 

There are several points about this module:
* This module is **open for Spring scanning** of beans (needed for Spring flow, Spring using reflection with code generation and need access to code to register beans inside the module)
* This module requires transitively spring dependencies, it means that modules that depends on this module can access spring dependencies without declaring that in their module-info.java.
* This module exports two packages, this packages are available for another modules that will require this module.

--- 

#### Application module
Hello module contains following [module-info.java](https://github.com/vlsidlyarevich/spring-boot-java10-hello-world/blob/master/application/src/main/java/module-info.java):


```java
//Open for spring CGLIB
open module application {
    //BUG
    requires java.sql;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires hello;
}
``` 

There are several points about this module:
* This module is **open for Spring scanning** of beans (needed for Spring flow, Spring using reflection with code generation and need access to code to register beans inside the module)
* This module requires spring dependencies.
* This module requires hello module, thus it can use dependencies located in hello module.
