# SpringbootKotlin
use kotlin to write a simple spring boot demo


# 报查找不到bean类字段的问题：主要出于大小写的问题上：
## 在appkication.properties上添加如下即可：
#sql表名含有大写的字段的问题解决方法
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
