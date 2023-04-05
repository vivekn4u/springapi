FROM openjdk:20
EXPOSE 8081
ADD target/springapi.jar springapi.jar
ENTRYPOINT ["java", "-jar", "springapi.jar"]
