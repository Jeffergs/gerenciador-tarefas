FROM gradle:8.14-jdk17-alpine AS build
WORKDIR /app
COPY . .
run gradle build --no-daemon

FROM amazoncorretto:17-alpine

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/gerenciador-tarefas.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/gerenciador-tarefas.jar"]

