# Use a base image containing Java runtime
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /kafka-demo

# Copy the Spring Boot JAR file into the container
COPY target/kafka-demo-0.0.1-SNAPSHOT.jar kafka-demo-0.0.1-SNAPSHOT.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "kafka-demo-0.0.1-SNAPSHOT.jar"]
