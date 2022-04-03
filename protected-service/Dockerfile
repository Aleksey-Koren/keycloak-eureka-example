FROM openjdk:17.0
WORKDIR ~/app/
COPY ./target/protected-service-0.0.1-SNAPSHOT.jar ~/app/
EXPOSE 8081
CMD ["java", "-jar", "~/app/protected-service-0.0.1-SNAPSHOT.jar"]