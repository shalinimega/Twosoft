FROM eclipse-temurin:17
COPY target/twosoft.jar twosoft.jar
CMD ["java","-jar","twosoft.jar"]