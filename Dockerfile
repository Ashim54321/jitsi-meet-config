# Base image for Jitsi Meet
FROM adoptopenjdk/openjdk11:alpine-jre

# Copy the Spring Boot application JAR file into the container
COPY target/myapp.jar /myapp.jar

# Set the Spring Boot application port
EXPOSE 8080

# Start the Spring Boot application when the container starts
CMD ["java", "-jar", "/myapp.jar"]
