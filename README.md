# Checking Integration Environment
验证环境是否集成成功

## Maven验证
以下两个命令至少有一个是成功执行，并得到如下的控制台截图
![maven命令执行截图](mvn.jpg)
```bash
mvn test -U
./mvnw test -U
```

## Gradle验证
以下两个命令至少有一个是成功执行，并得到如下的控制截图
![gralde命令执行截图](gradle.jpg)
```bash
gradle test
./gradlew test
```