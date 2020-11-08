# RollCall-rear-end
后端的内容就放这里啦

# 后端全套

https://linlinjava.gitbook.io/litemall/project

# 一、Maven

1.1maven是一个跨平台的项目管理工具。

1.2它是Apache的一个开源项目，主要服务于基于Java平台的项目构建、依赖管理和项目信息管理。不重复发明轮子。

1.3简单、交流与反馈、测试驱动开发(TDD)、十分钟构建、持续集成(CI)、富有信息的工作区。Maven几乎友好的支持任何软件开发方法；Maven帮助快速发布项目。

# 二、SpringBoot

  SpringBoot是一个框架，一种全新的编程规范，他的产生简化了框架的使用，所谓简化是指简化了Spring众多框架中所需的大量且繁琐的配置文件，所以 SpringBoot是一个服务于框架的框架，服务范围是简化配置文件。

2.1、独立运行Spring项目

Spring boot 可以以jar包形式独立运行，运行一个Spring Boot项目只需要通过java -jar xx.jar来运行。

2.2、内嵌servlet容器

Spring Boot可以选择内嵌Tomcat、jetty或者Undertow,这样我们无须以war包形式部署项目。

2.3、提供starter简化Maven配置

spring提供了一系列的start pom来简化Maven的依赖加载，例如，当你使用了spring-boot-starter-web,会自动加入依赖包

2.4、自动装配Spring 

SpringBoot会根据在类路径中的jar包，类、为jar包里面的类自动配置Bean，这样会极大地减少我们要使用的配置。当然，SpringBoot只考虑大多数的开发场景，并不是所有的场景，若在实际开发中我们需要配置Bean，而SpringBoot灭有提供支持，则可以自定义自动配置。

2.5、准生产的应用监控

SpringBoot提供基于http ssh telnet对运行时的项目进行监控。

2.6、无代码生产和xml配置　　

SpringBoot不是借助与代码生成来实现的，而是通过条件注解来实现的，这是Spring4.x提供的新特性

3、SpringBoot优缺点
优点：
3.1、快速构建项目。
3.2、对主流开发框架的无配置集成。
3.3、项目可独立运行，无须外部依赖Servlet容器。
3.4、提供运行时的应用监控。
3.5、极大的提高了开发、部署效率。
3.6、与云计算的天然集成。
缺点：
3.1、如果你不认同spring框架，也许这就是缺点。
4、SpringBoot特性
4.1、创建独立的Spring项目
4.2、内置Tomcat和Jetty容器
4.3、提供一个starter POMs来简化Maven配置
4.4、提供了一系列大型项目中常见的非功能性特性，如安全、指标，健康检测、外部配置等

4.5、完全没有代码生成和xml配置文件

6、SpringBoot CLI
   SpringBoot CLI 是SpringBoot提供的控制台命令工具。

[SpringBoot微信点餐系统](https://www.jianshu.com/p/ae14101989f2)

[Spring Boot（5）一个极简且完整的后台框架](https://www.jianshu.com/p/923d26d705ed)

[Spring Boot之前后端分离（一）：Vue前端](https://www.jianshu.com/p/23476305dc69)

[Spring Boot 2.X(一)：入门篇](https://www.cnblogs.com/zwqh/p/11645721.html)

# 三、mybatis