FROM openjdk:19-jdk-alpine

LABEL authors="aleksadr"

EXPOSE 8081
ADD build/libs/SpringBootHW_conditional-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","myapp.jar"]