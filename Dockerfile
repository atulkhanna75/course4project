FROM openjdk:17
COPY ./target/course4Project-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","course4Project-0.0.1-SNAPSHOT.jar"]