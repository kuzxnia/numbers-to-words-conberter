# numbers to words converter
This project implements an algorithm which converts a number to word decryption  

## Getting Started
This guide walks you through to build number converter.

#### What you’ll need
- About 1 and half minutes
- JDK 1.8 or later
- Gradle 4+

#### Project Installing

- Download and unzip the source repository, or clone it using Git:
``git clone https://github.com/kuzxnia/numbers-to-words-converter.git``
- cd into ``numbers-to-words-converter``
### Run the application
To run the application, execute: 

```
 ./gradlew bootRun
```

You should see some output like this:

```
:compileKotlin UP-TO-DATE
:compileJava NO-SOURCE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.1.RELEASE)

2018-05-08 23:04:19.364  INFO 10069 --- [           main] com.kuzniarski.ApplicationKt             : Starting ApplicationKt on kuznia-Latitude-E7470 with PID 10069 (/home/kuznia/workspace/numbers-to-words-converter/build/classes/kotlin/main started by kuznia in /home/kuznia/workspace/numbers-to-words-converter)
2018-05-08 23:04:19.368  INFO 10069 --- [           main] com.kuzniarski.ApplicationKt             : No active profile set, falling back to default profiles: default
2018-05-08 23:04:19.450  INFO 10069 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@ca263c2: startup date [Tue May 08 23:04:19 CEST 2018]; root of context hierarchy
2018-05-08 23:04:19.688  WARN 10069 --- [kground-preinit] o.s.h.c.j.Jackson2ObjectMapperBuilder    : For Jackson Kotlin classes support please add "com.fasterxml.jackson.module:jackson-module-kotlin" to the classpath
2018-05-08 23:04:20.642  INFO 10069 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-05-08 23:04:20.670  INFO 10069 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-05-08 23:04:20.670  INFO 10069 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.29
2018-05-08 23:04:20.681  INFO 10069 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib]
2018-05-08 23:04:20.769  INFO 10069 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-05-08 23:04:20.770  INFO 10069 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1322 ms
2018-05-08 23:04:20.902  INFO 10069 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-05-08 23:04:20.907  INFO 10069 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-05-08 23:04:20.907  INFO 10069 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-05-08 23:04:20.907  INFO 10069 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-05-08 23:04:20.907  INFO 10069 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-05-08 23:04:21.568  INFO 10069 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-05-08 23:04:21.960  INFO 10069 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@ca263c2: startup date [Tue May 08 23:04:19 CEST 2018]; root of context hierarchy
2018-05-08 23:04:22.035  INFO 10069 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/number/{number}],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> com.kuzniarski.BasicController.hello(long)
2018-05-08 23:04:22.039  INFO 10069 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-05-08 23:04:22.039  INFO 10069 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-05-08 23:04:22.063  INFO 10069 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-05-08 23:04:22.065  INFO 10069 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-05-08 23:04:22.254  INFO 10069 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-05-08 23:04:22.360  INFO 10069 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-05-08 23:04:22.365  INFO 10069 --- [           main] com.kuzniarski.ApplicationKt             : Started ApplicationKt in 3.352 seconds (JVM running for 3.685)
```

Now you can check out the service.

```
$ curl http://localhost:8080/number/735423
seven hundred, thirty-five thousand, four hundred, twenty-three
```

### Author

- Kacper Kuźniarski - [kuzxnia](https://github.com/kuzxnia) 