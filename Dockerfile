FROM ubuntu:latest

WORKDIR /app

# Install Java and Maven
RUN apt-get update && apt-get install -y openjdk-21-jdk maven && rm -rf /var/lib/apt/lists/*

# Copy your Maven project files
COPY . /app

# Set up working directory
WORKDIR /app

# Run Maven build to generate the JAR file
RUN mvn clean package -DskipTests

# Expose the port if your application is a web service
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "target/scientific_calculator.jar"]
