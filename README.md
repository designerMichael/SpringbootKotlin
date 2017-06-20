# SpringbootKotlin
 ### 本deomo: use kotlin to write a simple spring boot demo
  ** 主题　学习springboot ，用kotlin实现。**
 ## 发现如下问题，顺便记录下方便以后翻阅
 # 问题一：生成数据库bean类的时候，引用错依赖
  <!--<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<version>1.0.0.Final</version>
		</dependency>-->

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

# 问题二：报查找不到bean类字段的问题：主要出于大小写的问题上：
## 在appkication.properties上添加如下即可：
#sql表名含有大写的字段的问题解决方法
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
