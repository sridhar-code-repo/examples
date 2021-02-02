FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/employee-service-1.0-SNAPSHOT.jar employee-service.jar
ENTRYPOINT ["java","-jar","/employee-service.jar"]