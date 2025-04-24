# My Awesome Auto-Configuration

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