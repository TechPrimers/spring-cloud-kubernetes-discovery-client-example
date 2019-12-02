FROM openjdk:8
COPY target/spring-cloud-kubernetes-server-example-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar