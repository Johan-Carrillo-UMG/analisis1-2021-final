FROM openjdk:latest

COPY . /var/www/java
WORKDIR /var/www/java

CMD ["java","-jar","examenfinalas1-1.0.jar"]

