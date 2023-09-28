FROM openjdk:17-jdk-slim
RUN mkdir jaebal
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
