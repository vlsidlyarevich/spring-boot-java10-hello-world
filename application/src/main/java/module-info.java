//Open for spring CGLIB
open module application {
    //BUG
    requires java.sql;
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires hello;
}
