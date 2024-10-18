# Etapa de build
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa de runtime
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/seu-app.jar /app/seu-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/seu-app.jar"]
