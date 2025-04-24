
# What is Spring Boot Auto-Configuration?

Spring Boot auto-configuration is magic that just works ✨ — but under the hood, it's smart configuration logic that automatically sets up your Spring application based on what's on the classpath and your settings.

# How Does It Work?

Spring Boot looks for auto-configuration classes using special metadata and includes them in the application context only if certain conditions are met.

These classes:

Are marked with @Configuration
Often use @ConditionalOnClass, @ConditionalOnMissingBean, @ConditionalOnProperty, etc.
Are registered using:
(In Spring Boot 3+) META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
(In older versions) META-INF/spring.factories


## Features
- Auto-registers a HelloService bean
- Uses new `AutoConfiguration.imports` (Spring Boot 3.x)

## Usage
Add this as a dependency and use:

```java
@Autowired
HelloService helloService;

helloService.sayHello(); // "Hello from AutoConfiguration!"
```
