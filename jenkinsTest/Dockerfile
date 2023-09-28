FROM openjdk:17-jdk-slim
RUN cd /var/jenkins_home/workspace/test/jenkinsTest/build/libs
ARG JAR_FILE=*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
