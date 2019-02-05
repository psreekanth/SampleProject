FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/stample-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
