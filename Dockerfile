FROM eclipse-temurin:22-jre-alpine

WORKDIR /app

COPY ./Consumer/target/Consumer-1.0-SNAPSHOT.jar/ /app
COPY ./Provider/target/Provider-1.0-SNAPSHOT.jar/ /app
COPY ./Service/target/Service-1.0-SNAPSHOT.jar/ /app

ENTRYPOINT ["java","--module-path","/app","--module","org.example.consumer/org.example.consumer.Main"]
