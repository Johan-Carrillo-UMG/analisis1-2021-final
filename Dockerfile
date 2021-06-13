FROM openjdk
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac Hola.java
CMD ["java","Hola"]