FROM eclipse-temurin:21-jre
WORKDIR /work/
COPY target/*-runner.jar /work/app.jar
COPY target/lib/* /work/lib/
EXPOSE 8080
ENV QUARKUS_HTTP_PORT=8080
ENV QUARKUS_HTTP_HOST=0.0.0.0
CMD ["java", "--add-opens", "java.base/java.lang=ALL-UNNAMED", "-Dquarkus.http.host=0.0.0.0", "-jar", "app.jar"]