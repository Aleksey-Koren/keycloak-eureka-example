FROM openjdk:17.0
WORKDIR ~/app/
COPY ./target/keycloak-eureka-serv-0.0.1-SNAPSHOT.jar ~/app/
EXPOSE 8761
CMD ["java", "-jar", "~/app/keycloak-eureka-serv-0.0.1-SNAPSHOT.jar"]