## Tries to reproduce https://github.com/spring-projects/spring-data-relational/issues/1506

The OP of the issue observes that embedded entities get constructed, although they should not.
This little test tries to recreate this behaviour but fails. 

Please run 
```java
./mvnw clean verify
```
