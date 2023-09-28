FROM openjdk:17-jdk-slim
RUN mkdir jaebal
ARG JAR_FILE=/var/jenkins_home/workspace/test/jenkinsTest/build/libs/jenkinsTest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
