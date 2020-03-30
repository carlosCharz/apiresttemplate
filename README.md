# API Rest Template + Maven Profiles + Spring Profiles + Spring Boot

This is a Spring Boot Rest template project that handle the application properties per environment using Maven profiles. It has 3 layers (Controller, Service and Dao). It additionally has error handling, AOP profilers Mappers, and Swagger for documentation.

## Which Profile?

There are two kind of profiles:

1. [Maven Profiles](http://maven.apache.org/guides/introduction/introduction-to-profiles.html): A build-time approach.
```
clean install -Pdev
```

2. [Spring Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html): A runtime approach.
```
java -jar -Dspring.profiles.active=dev xxx.jar
```

The answer depends on your requirements. A good rule of thumb:

_**If you need different artifacts then go with Maven profiles. If it is just a real configuration that can be set AFTER the artifact is built then go with Spring profiles.**_

Basically, Maven profiles would provide a build-time solution, while Spring profiles would provide a runtime alternative.

## Technologies

1. Spring Boot 2.x (spring-boot-starter-web, spring-boot-starter-tomcat)
2. Java 8
3. Tomcat 8.5.x
4. Maven

## Architecture
 
1. **Controller:** is the presentation layer where the end points are located
2. **Service:** is the service layer where the business logic resides
3. **Dao:** is the persistence layer where the repository logic resides

## Exposed methods to test that works

**1. HTTP Method: GET**
```
http://localhost:8080/apiresttemplate/params/all
```

**2. HTTP Method: GET**
```
http://localhost:8080/apiresttemplate/params/test
```

**3. HTTP Method: GET**
```
http://localhost:8080/apiresttemplate/params/exception
```

## To check that Swagger is configured correctly

**1. HTTP Method: GET**
```
http://localhost:8080/apiresttemplate/v2/api-docs
```

**2. HTTP Method: GET**
```
http://localhost:8080/apiresttemplate/swagger-ui.html
```

## Other Alternatives (Examples)

* [Activate Spring property files with Maven profiles](http://dolszewski.com/spring/spring-boot-properties-per-maven-profile/): It replaces the placeholder for the _spring.profiles.active_ variable with the active Maven profile at build time so the Spring framework, after starting your app, can load the appropriate configuration file based on the name of the active Spring profile.
* [Maven copy-rename-maven-plugin plugin](https://coderplus.github.io/copy-rename-maven-plugin/usage.html): The idea is to copy the complete specific profile file (dev.properties) to create the application properties inside the project output directory (application.properties). For this you need the help of Maven resources and Maven filtering. The best usage of this rename plugin is when you need a .json file or .txt file per environment.

## Useful Documentation

* [Automatic Property Expansion using Maven](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-properties-and-configuration.html)
* [Spring Boot Relaxed Binding](https://github.com/spring-projects/spring-boot/wiki/Relaxed-Binding-2.0)
* [Spring Boot Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
* [Spring Boot traditional deployment](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html)
* [Spring Boot 2 - Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes)
* [Spring Boot 2.2 - Release Notes](https://github.com/spring-projects/spring-booT/wiki/Spring-Boot-2.2.0-M1-Release-Notes)

## Troubleshooting

* All the build phase is done correctly from Eclipse or CLI (Command Line Interface) for the 'dev' profile with the command 'clean install -Pdev'. The war file is created with the variables from the desired profile. If you deploy the war in a Tomcat container manually or using Jenkins it is going to work properly. _The problem might arise when you deploy using Eclipse. There are some issues with the m2e plugin where even when you build with the -Pdev it takes the activeByDefault profile. It seems that Eclipse is ignoring the profile provided. In that case, right click to the project -> Properties -> Maven and set the active Maven profile._
