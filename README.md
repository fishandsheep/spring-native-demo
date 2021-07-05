# spring-native-demo
spring-native-demo test RestTemplate

1.Create the executable:
```shell
$ ./mvnw -Pnative package
```

2.Run app by regular is normal: 
```shell
$ java -jar target/spring-native-0.0.1-SNAPSHOT-exec.jar 
```

3.Test
```shell
$ curl http://localhost:8080/test/rest -w '\n'
```

4.Run app by binary file the app will stop: 
```shell
$ target/spring-native 
```

5.Repeat the step3 and the interrupted message is:
```
[1]    8639 segmentation fault  target/spring-native
```
