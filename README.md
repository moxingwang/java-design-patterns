<!-- the line below needs to be an empty line C: (its because kramdown isnt
     that smart and dearly wants an empty line before a heading to be able to
     display it as such, e.g. website) -->

# Design patterns implemented in Java

[![Build status](https://travis-ci.org/iluwatar/java-design-patterns.svg?branch=master)](https://travis-ci.org/iluwatar/java-design-patterns)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![Join the chat at https://gitter.im/iluwatar/java-design-patterns](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/iluwatar/java-design-patterns?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=com.iluwatar%3Ajava-design-patterns&metric=alert_status)](https://sonarcloud.io/dashboard/index/com.iluwatar%3Ajava-design-patterns)
[![CII Best Practices](https://bestpractices.coreinfrastructure.org/projects/1503/badge)](https://bestpractices.coreinfrastructure.org/projects/1503)

# Introduction

Design patterns are formalized best practices that the programmer can use to
solve common problems when designing an application or system.

Design patterns can speed up the development process by providing tested, proven
development paradigms.

Reusing design patterns helps to prevent subtle issues that can cause major
problems, and it also improves code readability for coders and architects who
are familiar with the patterns.

### 结合[史上最全设计模式导学目录（完整版）](https://blog.csdn.net/lovelion/article/details/17517213)学习和理解

# Getting started

Before you dive into the material, you should be familiar with various
Programming/Software Design Principles.

All designs should be as simple as possible. You should start with KISS, YAGNI,
and Do The Simplest Thing That Could Possibly Work principles. Complexity and
patterns should only be introduced when they are needed for practical
extensibility.

Once you are familiar with these concepts you can start drilling down into
patterns by any of the following approaches

 - Using difficulty tags, `Difficulty-Beginner`, `Difficulty-Intermediate` & `Difficulty-Expert`.
 - Using pattern categories, `Creational`, `Behavioral` and others.
 - Search for a specific pattern. Can't find one? Please report a new pattern [here](https://github.com/iluwatar/java-design-patterns/issues).

# How to contribute

If you are willing to contribute to the project you will find the relevant information in our [developer wiki](https://github.com/iluwatar/java-design-patterns/wiki). We will help you and answer your questions in the [Gitter chatroom](https://gitter.im/iluwatar/java-design-patterns).

# License

This project is licensed under the terms of the MIT license.

# List
- 单例模式【singleton】：某个类只能有一个实例，提供一个全局的访问点。

- 简单工厂【】：一个工厂类根据传入的参量决定创建出那一种产品类的实例。

- 工厂方法【factory-method】：定义一个创建对象的接口，让子类决定实例化那个类。

- 抽象工厂【abstract-factory】：创建相关或依赖对象的家族，而无需明确指定具体类。

- 建造者模式【builder】：封装一个复杂对象的构建过程，并可以按步骤构造。

- 原型模式【prototype】：通过复制现有的实例来创建新的实例。



- 适配器模式【adapter】：将一个类的方法接口转换成客户希望的另外一个接口。

- 组合模式【】：将对象组合成树形结构以表示“”部分-整体“”的层次结构。

- 装饰模式【】：动态的给对象添加新的功能。

- 代理模式【】：为其他对象提供一个代理以便控制这个对象的访问。

- 亨元（蝇量）模式【】：通过共享技术来有效的支持大量细粒度的对象。

- 外观模式【】：对外提供一个统一的方法，来访问子系统中的一群接口。

- 桥接模式【bridge】：将抽象部分和它的实现部分分离，使它们都可以独立的变化。



- 模板模式【】：定义一个算法结构，而将一些步骤延迟到子类实现。

- 解释器模式【】：给定一个语言，定义它的文法的一种表示，并定义一个解释器。

- 策略模式【】：定义一系列算法，把他们封装起来，并且使它们可以相互替换。

- 状态模式【】：允许一个对象在其对象内部状态改变时改变它的行为。

- 观察者模式【】：对象间的一对多的依赖关系。

- 备忘录模式【】：在不破坏封装的前提下，保持对象的内部状态。

- 中介者模式【】：用一个中介对象来封装一系列的对象交互。

- 命令模式【】：将命令请求封装为一个对象，使得可以用不同的请求来进行参数化。

- 访问者模式【】：在不改变数据结构的前提下，增加作用于一组对象元素的新功能。

- 责任链模式【】：将请求的发送者和接收者解耦，使的多个对象都有处理这个请求的机会。

- 迭代器模式【】：一种遍历访问聚合对象中各个元素的方法，不暴露该对象的内部结构。