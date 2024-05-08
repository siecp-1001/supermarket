FROM openjdk:17
ADD target/supermarket-0.0.1-SNAPSHOT.jar supermarket.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar supermarket.jar"]
