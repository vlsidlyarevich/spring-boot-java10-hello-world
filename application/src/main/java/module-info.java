//Open for spring CGLIB
open module application {
    //BUG
    requires java.sql;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires hello;
}
