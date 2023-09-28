FROM openjdk:17-jdk-slim

ARG JAR_FILE=jenkinsTest-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} myboot.jar

ENTRYPOINT ["java","-jar","/myboot.jar"]
