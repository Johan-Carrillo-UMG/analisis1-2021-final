FROM openjdk
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac PartyApp.java
CMD ["java","PartyApp"].