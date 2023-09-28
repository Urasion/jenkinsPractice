FROM openjdk:17-jdk-slim

COPY $/var/jenkins_home/workspace/test/jenkinsTest/build/libs/jenkinsTest-0.0.1-SNAPSHOT.jar myboot.jar

ENTRYPOINT ["java","-jar","/myboot.jar"]
