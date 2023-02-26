FROM openjdk:8-jre
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java", "-jar","demo.jar"]
EXPOSE 8080