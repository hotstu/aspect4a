[![author](https://img.shields.io/badge/author-hglf-blue.svg)](https://github.com/hotstu)
[![Download](https://img.shields.io/maven-central/v/io.github.hotstu.aspect4a/plugin?style=flat-square) ](https://search.maven.org/search?q=g:io.github.hotstu.aspect4a) 
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Aspect4A
===================
aop for android

自用的Android Aop织入Gradle插件

网上可能有其他很多， 质量参差不齐，使用麻烦


已上传mavenCentral， 引用方便

使用
1 
```
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.2.1"
        classpath 'io.github.hotstu.aspect4a:plugin:1.0.0'
    }
}

```
2 make your own inject rules(see demo)

3 apply plugin in app:

```
apply plugin: 'com.android.application'
apply plugin: 'io.github.hotstu.aspect4a.plugin'
```