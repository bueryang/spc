
#Spring Cloud 学习备忘
1 不同版本文档注意
2 特定的参数位于特定的配置文件注意（bootstrap.yml、application.yml、application.properties）
3 Eureka、Ribbon、Feign、Hystrix、Zuul、Bus、Sleuth 、Dapper、Hystrix Dashboard


---------------------------备忘---------------------------
#手动指定版本
mvn --batch-mode release:update-versions -DdevelopmentVersion=1.3.4-SNAPSHOT

#发布正式版本
mvn release:clean release:prepare

#打包
mvn clean install

#mysql 禁用group full query
set global sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';

#运行,custom.properties中的property会覆盖application.properties中的值
java -jar target/tester-0.0.1-SNAPSHOT.jar --spring.config.location=/tmp/custom.properties



